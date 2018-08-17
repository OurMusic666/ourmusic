package com.music.Team.dao;

import com.music.Team.bean.User;

public interface UserDao extends BaseDao<User> {

	void insert(User t);

	void delete(User t);

	void update(User t);

	User select();
	
}
