package com.music.Team.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;
import com.music.Team.bean.MusicInfo;


public class SongsBuilder {	
	private static ArrayList<MusicInfo> musicInfo = new ArrayList<MusicInfo>();
	private static ArrayList<String> scanFiles = new ArrayList<String>();
	private static MusicInfo Info;
	
	private static Mp3File mp3;
	private static MP3File mp3File;
	private static final int START=6;
	private static String picUrl;
	/**
	 * 提供一个方法  只需要用户输入绝对地址   即可查出地址下的所有文件  
	 * TODO   还没有确保只查出 mp3文件
	 */
	
	public static ArrayList<MusicInfo> getMusic(String folderPath){
		scanFilesWithRecursion(folderPath);
		return musicInfo;
	}
	/**
	 * TODO:递归扫描指定文件夹下面的指定文件
	 * @throws Exception 
	 */
	private static void scanFilesWithRecursion(String folderPath){
		pushRodomName(folderPath);
		File directory = new File(folderPath);
		File [] filelist=null;
		if(!directory.isDirectory()){
			try {
				throw new Exception('"' + folderPath + '"' + " input path is not a Directory , please input the right path of the Directory. ^_^...^_^");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(directory.isDirectory()){
			filelist = directory.listFiles();
			for(int i = 0; i < filelist.length; i ++){
				/**如果当前是文件夹，进入递归扫描文件夹**/
				if(filelist[i].isDirectory()){
					/**递归扫描下面的文件夹**/
					scanFilesWithRecursion(filelist[i].getAbsolutePath());
				}
			/**非文件夹**/
				else{
					if(filelist[i].getAbsolutePath().endsWith(".mp3")) {
						scanFiles.add(filelist[i].getAbsolutePath());
						getContent(filelist[i].getAbsolutePath(),folderPath);
					}
					continue;
				}
			}
		}
		System.out.println("=============查询完成!=================");
		show();
		System.out.println("\t\t共查到数据:"+scanFiles.size()+"条");
	}
	
	private static void show() {
		for(String filepath : scanFiles) {
			System.out.println(filepath);
		}
		
	}
	private static void getContent(String filepath, String folderPath) {
		try {
		mp3=new Mp3File(filepath);
		mp3File=new MP3File(filepath);
		Info=new MusicInfo();
		AbstractID3v2Tag id3v2tag=  mp3File.getID3v2Tag();
		ID3v2 id3v2= mp3.getId3v2Tag();
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
			picUrl=folderPath+File.separator+ToMD5(Info.getName())+".jpg";
			FileImage(id3v2.getAlbumImage());
			Info.setPic(picUrl);
		musicInfo.add(Info);
		System.out.println(Info.toString());
		} catch (Exception e) {
			System.out.println("没有获取到任何信息");
		}
		
	}
	
	private static void FileImage(byte[] imageData) {
	    if(!new File(picUrl).exists()) {
	    	try {
				BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageData));
				ImageIO.write(img, "jpg", new File(picUrl));
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println("图片导出完成");
	    	System.out.println("url->"+picUrl);
		}else {
			System.out.println("图片已导出并存在");
		}
	}
	
	private static void pushRodomName(String folderPath) {
		int index=0;
		String newstr=null;
		File directory = new File(folderPath);
		File [] file=directory.listFiles();
		for(int i = 0; i < file.length; i ++){
			if(file[i].getAbsolutePath().endsWith(".mp3")){
				System.out.println("旧地址："+file[i].getAbsolutePath());
				newstr=folderPath+File.separator+ToMD5(file[i].getName().replaceAll(".mp3", ""))+".mp3";
				System.out.println("新地址："+newstr);
				File files=new File(newstr);
				file[i].renameTo(files);
				index+=1;
			}
		}	
		System.out.println("修改完成！共修改"+index+"条数据！");
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
