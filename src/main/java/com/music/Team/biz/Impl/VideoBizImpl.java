package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Video;
import com.music.Team.biz.VideoBiz;
import com.music.Team.dao.VideoDao;
@Service
public class VideoBizImpl implements VideoBiz {

	@Autowired
	private VideoDao videoDao;
	
	public void insert(Video t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Video t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Video t) {
		// TODO Auto-generated method stub
		
	}

	public Video select() {
		// TODO Auto-generated method stub
		return null;
	}

	public VideoDao getVideoDao() {
		return videoDao;
	}

	public void setVideoDao(VideoDao videoDao) {
		this.videoDao = videoDao;
	}
	
}
