package com.music.Team.dao;

import com.music.Team.bean.Video;

public interface VideoDao extends BaseDao<Video>{

	void insert(Video t);

	void delete(Video t);

	void update(Video t);

	Video select();
	
}
