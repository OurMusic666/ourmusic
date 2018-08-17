package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("reply")
public class Reply {
	//评论id
	private Integer reply_id;
	//评论内容
	private String reply_desc;
	//评论时间
	private String reply_date;
	//评论歌曲id
	private Integer music_id;
	//评论的视频id
	private Integer video_id;
	//评论者id
	private Integer user_id;
	
	public Integer getReply_id() {
		return reply_id;
	}
	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}
	public String getReply_desc() {
		return reply_desc;
	}
	public void setReply_desc(String reply_desc) {
		this.reply_desc = reply_desc;
	}
	public String getReply_date() {
		return reply_date;
	}
	public void setReply_date(String reply_date) {
		this.reply_date = reply_date;
	}
	public Integer getMusic_id() {
		return music_id;
	}
	public void setMusic_id(Integer music_id) {
		this.music_id = music_id;
	}
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}
