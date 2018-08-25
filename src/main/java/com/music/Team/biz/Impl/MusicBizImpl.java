package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Music;
import com.music.Team.biz.MusicBiz;
import com.music.Team.dao.MusicDao;
@Service
public class MusicBizImpl implements MusicBiz{

	@Autowired
	private MusicDao musicDao;
	
	public void insert(Music t) {
		musicDao.insert(t);
	}

	public void delete(Music t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Music t) {
		// TODO Auto-generated method stub
		
	}

	public Music select() {
		// TODO Auto-generated method stub
		return null;
	}

	public MusicDao getMusicDao() {
		return musicDao;
	}

	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
	}

}
