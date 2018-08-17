package com.music.Team.dao;

import com.music.Team.bean.Music;

public interface MusicDao extends BaseDao<Music>{

	void insert(Music t);

	void delete(Music t);

	void update(Music t);

	Music select();
	
}
