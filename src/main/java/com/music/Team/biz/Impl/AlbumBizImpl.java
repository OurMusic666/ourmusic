package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Album;
import com.music.Team.biz.AlbumBiz;
import com.music.Team.dao.AlbumDao;
@Service
public class AlbumBizImpl implements AlbumBiz{

	@Autowired
	private AlbumDao albumDao;
	
	public void insert(Album t) {
		albumDao.insert(t);
	}

	public void delete(Album t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Album t) {
		// TODO Auto-generated method stub
		
	}

	public Album select() {
		// TODO Auto-generated method stub
		return null;
	}

	public AlbumDao getAlbumDao() {
		return albumDao;
	}

	public void setAlbumDao(AlbumDao albumDao) {
		this.albumDao = albumDao;
	}
	
}
