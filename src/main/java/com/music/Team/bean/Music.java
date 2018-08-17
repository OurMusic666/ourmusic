package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("music")
public class Music {
	//歌曲id
	private Integer music_id;
	//歌曲名字
	private String music_name;
	//歌曲歌手名
	private Integer music_singerid;
	//专辑id
	private Integer music_album;
	//歌词
	private String music_lyr;
	//会员（0/1）
	private Integer music_isMember;
	
	public Integer getMusic_isMember() {
		return music_isMember;
	}
	public void setMusic_isMember(Integer music_isMember) {
		this.music_isMember = music_isMember;
	}
	public Integer getMusic_id() {
		return music_id;
	}
	public void setMusic_id(Integer music_id) {
		this.music_id = music_id;
	}
	public String getMusic_name() {
		return music_name;
	}
	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}
	public Integer getMusic_singerid() {
		return music_singerid;
	}
	public void setMusic_singerid(Integer music_singerid) {
		this.music_singerid = music_singerid;
	}
	public Integer getMusic_album() {
		return music_album;
	}
	public void setMusic_album(Integer music_album) {
		this.music_album = music_album;
	}
	public String getMusic_lyr() {
		return music_lyr;
	}
	public void setMusic_lyr(String music_lyr) {
		this.music_lyr = music_lyr;
	}
	
}
