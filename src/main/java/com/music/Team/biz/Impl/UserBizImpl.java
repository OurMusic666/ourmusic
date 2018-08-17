package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.User;
import com.music.Team.biz.UserBiz;
import com.music.Team.dao.UserDao;
@Service
public class UserBizImpl implements UserBiz {

	@Autowired
	private UserDao userDao;
	
	public void insert(User t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	public User select() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
