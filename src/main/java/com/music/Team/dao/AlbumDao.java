package com.music.Team.dao;

import org.springframework.stereotype.Repository;

import com.music.Team.bean.Album;
@Repository
public interface AlbumDao extends BaseDao<Album>{

	void insert(Album t);

	void delete(Album t);

	void update(Album t);

	Album select();
	
}
