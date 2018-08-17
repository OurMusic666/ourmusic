package com.music.Team.biz;

import com.music.Team.bean.Reply;

public interface ReplyBiz {

	void insert(Reply t);

	void delete(Reply t);

	void update(Reply t);

	Reply select();
	
}
