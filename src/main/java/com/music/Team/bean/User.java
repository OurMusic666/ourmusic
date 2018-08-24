package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
	//用户id
	private Integer user_id;
	//用户名
	private String user_name;
	//用户密码
	private String user_pwd;
	//用户生日
	private String user_bir;
	//用户性别
	private String user_sex;
	//用户密码
	private String user_email;
	//是否是会员
	private Integer user_isMember;
	//用户上一次所播放的歌曲
	private String user_lastMusic;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Integer getUser_isMember() {
		return user_isMember;
	}
	public void setUser_isMember(Integer user_isMember) {
		this.user_isMember = user_isMember;
	}
	public String getUser_bir() {
		return user_bir;
	}
	public void setUser_bir(String user_bir) {
		this.user_bir = user_bir;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_lastMusic() {
		return user_lastMusic;
	}
	public void setUser_lastMusic(String user_lastMusic) {
		this.user_lastMusic = user_lastMusic;
	}
	
}
