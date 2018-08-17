package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("sheet")
public class Sheet {
	//收藏夹id
	private Integer sheet_id;
	//收藏夹名字
	private String sheet_name;
	//对应用户id
	private Integer user_id;
	public Integer getSheet_id() {
		return sheet_id;
	}
	public void setSheet_id(Integer sheet_id) {
		this.sheet_id = sheet_id;
	}
	public String getSheet_name() {
		return sheet_name;
	}
	public void setSheet_name(String sheet_name) {
		this.sheet_name = sheet_name;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
}
