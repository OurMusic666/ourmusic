package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("usermusic")
public class UserMusic {
	//用户id
	private Integer user_id;
	//音乐id
	private Integer music_id;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getMusic_id() {
		return music_id;
	}
	public void setMusic_id(Integer music_id) {
		this.music_id = music_id;
	}
	
	
}
