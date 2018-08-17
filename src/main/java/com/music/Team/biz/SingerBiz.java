package com.music.Team.biz;

import com.music.Team.bean.Singer;

public interface SingerBiz {

	void insert(Singer t);

	void delete(Singer t);

	void update(Singer t);

	Singer select();
	
	
}
