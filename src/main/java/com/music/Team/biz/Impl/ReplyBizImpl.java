package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Reply;
import com.music.Team.biz.ReplyBiz;
import com.music.Team.dao.ReplyDao;
@Service
public class ReplyBizImpl implements ReplyBiz {

	@Autowired
	private ReplyDao replyDao;
	
	public void insert(Reply t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Reply t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Reply t) {
		// TODO Auto-generated method stub
		
	}

	public Reply select() {
		// TODO Auto-generated method stub
		return null;
	}

	public ReplyDao getReplyDao() {
		return replyDao;
	}

	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}

}
