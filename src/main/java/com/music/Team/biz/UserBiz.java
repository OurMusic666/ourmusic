package com.music.Team.biz;

import com.music.Team.bean.User;

public interface UserBiz {

	void delete(User t);

	void update(User t);

	User select();
	
	String selectName(User t);

	String selectUser(User t);
	
	String createUser(User t);
	
}
