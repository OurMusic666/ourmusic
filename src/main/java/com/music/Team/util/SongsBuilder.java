package com.music.Team.util;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;

import com.music.Team.bean.MusicInfo;


public class SongsBuilder {	
	private static ArrayList<MusicInfo> musicInfo = new ArrayList<MusicInfo>();
	private static ArrayList<String> scanFiles = new ArrayList<String>();
	private static MusicInfo Info;
	
	private static MP3File mp3File;
	private static final int START=6;
	/**
	 * 提供一个方法  只需要用户输入绝对地址   即可查出地址下的所有文件  
	 * TODO   还没有确保只查出 mp3文件
	 */
	
	public static ArrayList<MusicInfo> getMusic(String folderPath){
		scanFilesWithRecursion(folderPath);
		System.out.println(scanFiles);
		return musicInfo;
	}
	/**
	 * TODO:递归扫描指定文件夹下面的指定文件
	 * @throws Exception 
	 */
	private static void scanFilesWithRecursion(String folderPath){
		File directory = new File(folderPath);
		if(!directory.isDirectory()){
			try {
				throw new Exception('"' + folderPath + '"' + " input path is not a Directory , please input the right path of the Directory. ^_^...^_^");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(directory.isDirectory()){
			pushRodomName(folderPath);
			File [] filelist = directory.listFiles();
			for(int i = 0; i < filelist.length; i ++){
				/**如果当前是文件夹，进入递归扫描文件夹**/
				if(filelist[i].isDirectory()){
					/**递归扫描下面的文件夹**/
					scanFilesWithRecursion(filelist[i].getAbsolutePath());
				}
			/**非文件夹**/
				else{
					scanFiles.add(filelist[i].getAbsolutePath());
					System.out.println("更改前的路径:"+filelist[i].getAbsolutePath());
					getContent(filelist[i].getAbsolutePath());
				}
			}
		}
		System.out.println("=============查询完成!=================");
		System.out.println(scanFiles);
		System.out.println("\t\t共查到数据:"+scanFiles.size()+"条");
	}
	
	public static void getContent(String filepath) {
		try {
		mp3File=new MP3File(filepath);
		Info=new MusicInfo();
		AbstractID3v2Tag id3v2tag=  mp3File.getID3v2Tag();
			String song=new String(id3v2tag.frameMap.get("TIT2").toString().getBytes("UTF-8"),"UTF-8");  
			String singer=new String(id3v2tag.frameMap.get("TPE1").toString().getBytes("UTF-8"),"UTF-8");  
			String album=new String(id3v2tag.frameMap.get("TALB").toString().getBytes("UTF-8"),"UTF-8"); 
//			System.out.println("歌名："+song.substring(START, song.length()-3));  
//			System.out.println("歌手:"+singer.substring(START,singer.length()-3));  
//			System.out.println("专辑名："+album.substring(START,album.length()-3)); 
			//插入 musicInfo类  方便使用
			Info.setName(song.substring(START, song.length()-3));
			Info.setSinger(singer.substring(START,singer.length()-3));
			Info.setAlbum(album.substring(START,album.length()-3));
			Info.setUrl(filepath);
		musicInfo.add(Info);
		System.out.println(Info.toString());
		} catch (Exception e) {
			System.out.println("没有获取到任何信息");
		}
	}
	
	private static void pushRodomName(String args) {
		File rootfile=new File(args);
		File[]files=rootfile.listFiles();
		String newstr=args;
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){
				System.out.println("旧地址："+files[i].getAbsolutePath());
				newstr=args+File.separator+ToMD5(""+i)+".mp3";
				System.out.println("新地址："+newstr);
				File file=new File(newstr);
				files[i].renameTo(file);
			}
		}
		System.out.println("修改完成！共修改"+files.length+"条数据！");
	}

	private static String ToMD5(String str){
		MessageDigest md5=null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md5.update(str.getBytes());
		return new BigInteger(1,md5.digest()).toString(16);
	}
}
