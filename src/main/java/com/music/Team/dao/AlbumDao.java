package com.music.Team.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Album;
@Service
public interface AlbumDao extends BaseDao<Album>{

	@Insert("insert into album values(null,#{album_name},#{singer_id})")
	@Options(useGeneratedKeys=true,keyProperty="album_id",keyColumn="album_id")
	void insert(Album t);

	void delete(Album t);

	void update(Album t);

	Album select();
	
}
