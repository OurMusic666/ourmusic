package com.music.Team.dao;

import com.music.Team.bean.Singer;

public interface SingerDao extends BaseDao<Singer>{

	void insert(Singer t);

	void delete(Singer t);

	void update(Singer t);

	Singer select();
	
	
}
