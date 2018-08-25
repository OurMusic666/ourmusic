package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Singer;
import com.music.Team.biz.SingerBiz;
import com.music.Team.dao.SingerDao;
@Service
public class SingerBizImpl implements SingerBiz {

	@Autowired
	private SingerDao singerDao;
	
	public void insert(Singer t) {
		singerDao.insert(t);
	}

	public void delete(Singer t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Singer t) {
		// TODO Auto-generated method stub
		
	}

	public Singer select() {
		// TODO Auto-generated method stub
		return null;
	}

	public SingerDao getSingerDao() {
		return singerDao;
	}

	public void setSingerDao(SingerDao singerDao) {
		this.singerDao = singerDao;
	}

}
