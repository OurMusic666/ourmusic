package com.music.Team.bean;

import org.springframework.stereotype.Component;

public class SheetMusic {
	//收藏夹id
	private Integer sheet_id;
	//音乐id
	private Integer music_id;
	
	public Integer getSheet_id() {
		return sheet_id;
	}
	public void setSheet_id(Integer sheet_id) {
		this.sheet_id = sheet_id;
	}
	public Integer getMusic_id() {
		return music_id;
	}
	public void setMusic_id(Integer music_id) {
		this.music_id = music_id;
	}
	
	
}
