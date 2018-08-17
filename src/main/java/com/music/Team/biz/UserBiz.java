package com.music.Team.biz;

import com.music.Team.bean.User;

public interface UserBiz {

	void insert(User t);

	void delete(User t);

	void update(User t);

	User select();
	
}
