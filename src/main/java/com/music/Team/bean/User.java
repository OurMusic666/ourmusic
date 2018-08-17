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
	//用户密码
	private String user_email;
	//是否是会员
	private Integer user_isMember;
	
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
	
}
