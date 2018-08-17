package com.music.Team.biz;

import com.music.Team.bean.Music;

public interface MusicBiz{

	void insert(Music t);

	void delete(Music t);

	void update(Music t);

	Music select();
	
}
