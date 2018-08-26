package com.music.Team.bean;


public class Music {
	//歌曲id
	private Integer music_id;
	//歌曲名字
	private String music_name;
	//歌曲歌手名
	private Integer singer_id;
	//专辑id
	private Integer album_id;
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
	public Integer getSinger_id() {
		return singer_id;
	}
	public void setSinger_id(Integer singer_id) {
		this.singer_id = singer_id;
	}
	public Integer getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(Integer album_id) {
		this.album_id = album_id;
	}
	public String getMusic_lyr() {
		return music_lyr;
	}
	public void setMusic_lyr(String music_lyr) {
		this.music_lyr = music_lyr;
	}
	
}
