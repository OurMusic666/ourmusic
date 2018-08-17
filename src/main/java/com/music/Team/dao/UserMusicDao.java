package com.music.Team.dao;

import com.music.Team.bean.UserMusic;

public interface UserMusicDao extends BaseDao<UserMusic> {

	void insert(UserMusic t);

	void delete(UserMusic t);

	void update(UserMusic t);

	UserMusic select();
	
}
