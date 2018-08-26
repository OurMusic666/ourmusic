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

	@Override
	public String createUser(User t) {
		try{
			userDao.insertUser(t);
			return "恭喜您注册成功您的用户名为:"+t.getUser_name();
			}catch (Exception e){
				e.printStackTrace();
				return "注册失败请稍后再试";
			}
	}

	@Override
	public String selectName(User t) {
		t= userDao.selectName(t.getUser_name());
		try{
		if(t.getUser_id()!=null){
			return t.getUser_name();
			
		}else{
			return "";
		}
		
		}catch(NullPointerException e){
			e.printStackTrace();
			return "";
		}
	}

	@Override
	public String selectUser(User t) {
		t= userDao.selectUser(t.getUser_email(), t.getUser_pwd());
		try{
			if(t.getUser_id()!=null&&!t.getUser_id().equals("")){
				
				return t.getUser_name();
			}else{
				return "";
			}
			
		}catch(NullPointerException e){
			e.printStackTrace();
			return "";
		}
		
	}
}
