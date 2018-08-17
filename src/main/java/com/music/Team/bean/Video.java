package com.music.Team.bean;

import org.springframework.stereotype.Component;

@Component("video")
public class Video {
	//视频id
	private Integer video_id;
	//视频名字
	private String video_name;
	//发布者？歌手？用户？
	private Integer singer_id;
	
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public String getVideo_name() {
		return video_name;
	}
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	public Integer getSinger_id() {
		return singer_id;
	}
	public void setSinger_id(Integer singer_id) {
		this.singer_id = singer_id;
	}
	
	
}
