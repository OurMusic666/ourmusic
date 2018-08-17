package com.music.Team.dao;

import com.music.Team.bean.Reply;

public interface ReplyDao extends BaseDao<Reply>{

	void insert(Reply t);

	void delete(Reply t);

	void update(Reply t);

	Reply select();
	
}
