package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("alnum")
public class Album {
	//专辑id
	private Integer album_id;
	//专辑名字
	private String album_name;
	//专辑歌手
	private Integer album_singerid;
	
	public Integer getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(Integer album_id) {
		this.album_id = album_id;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public Integer getAlbum_singerid() {
		return album_singerid;
	}
	public void setAlbum_singerid(Integer album_singerid) {
		this.album_singerid = album_singerid;
	}
	
	
}
