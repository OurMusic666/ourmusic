package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.UserMusic;
import com.music.Team.biz.UserMusicBiz;
import com.music.Team.dao.UserMusicDao;
@Service
public class UserMusicBizImpl implements UserMusicBiz {

	@Autowired
	private UserMusicDao userMusicDao;
	
	public void insert(UserMusic t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserMusic t) {
		// TODO Auto-generated method stub
		
	}

	public void update(UserMusic t) {
		// TODO Auto-generated method stub
		
	}

	public UserMusic select() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserMusicDao getUserMusicDao() {
		return userMusicDao;
	}

	public void setUserMusicDao(UserMusicDao userMusicDao) {
		this.userMusicDao = userMusicDao;
	}

}
