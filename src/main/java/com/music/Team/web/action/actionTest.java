package com.music.Team.web.action;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.Team.bean.Album;
import com.music.Team.bean.Music;
import com.music.Team.bean.MusicInfo;
import com.music.Team.bean.Singer;
import com.music.Team.biz.AlbumBiz;
import com.music.Team.biz.MusicBiz;
import com.music.Team.biz.SingerBiz;
import com.music.Team.util.SongsBuilder;

@Controller
public class actionTest {
	@Resource
	SingerBiz sbi;
	@Resource
	AlbumBiz abi;
	@Resource
	MusicBiz mbi;
	
	
	@RequestMapping("/test")
	public String Test(Singer singer,Album album,Music music,Model model) {
		String array= "[{title:'海阔天空',artist:'Beyond',mp3:'songs/Beyond.mp3',poster: 'images/m0.jpg' }]";
		System.out.println("success");
		System.out.println(array);
		model.addAttribute("arraySongs", array);
		//输入歌曲绝对路径  插入数据库   文件夹路径
		InsertToSql(SongsBuilder.getMusic("E:\\Three\\mu"),singer,album,music);
		return "index";
	}

	private void InsertToSql(ArrayList<MusicInfo> Info, Singer singer, Album album, Music music) {
		for(MusicInfo musicInfo : Info) {
			singer.setSinger_name(musicInfo.getSinger());
			singer.setSinger_desc("我们都一样");
			sbi.insert(singer);
			
			System.out.println("歌手插入成功！");
			
			album.setAlbum_name(musicInfo.getAlbum());
			album.setSinger_id(singer.getSinger_id());
			abi.insert(album);
			
			System.out.println("专辑插入成功！");
			
			music.setMusic_name(musicInfo.getName());
			music.setMusic_pic(musicInfo.getPic());
			music.setMusic_url(musicInfo.getUrl());
			music.setSinger_id(singer.getSinger_id());
			music.setAlbum_id(album.getAlbum_id());
			music.setMusic_isMember(0);
			music.setMusic_lyr("暂无");
			mbi.insert(music);
			
			System.out.println("歌曲插入成功！");
		}
	}
}
