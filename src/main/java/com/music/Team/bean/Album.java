package com.music.Team.bean;


public class Album {
	//专辑id
	private Integer album_id;
	//专辑名字
	private String album_name;
	//专辑歌手
	private Integer singer_id;
	
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
	public Integer getSinger_id() {
		return singer_id;
	}
	public void setSinger_id(Integer singer_id) {
		this.singer_id = singer_id;
	}
	
	
}
