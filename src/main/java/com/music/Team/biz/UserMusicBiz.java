package com.music.Team.biz;

import com.music.Team.bean.UserMusic;

public interface UserMusicBiz {

	void insert(UserMusic t);

	void delete(UserMusic t);

	void update(UserMusic t);

	UserMusic select();
	
}
