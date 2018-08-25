package com.music.Team.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Music;
@Service
public interface MusicDao extends BaseDao<Music>{

	@Insert("insert into music values(null,#{music_name},#{singer_id},#{album_id},#{music_lrc},#{music_isMember})")
	@Options(useGeneratedKeys=true,keyProperty="music_id",keyColumn="music_id")
	void insert(Music t);

	void delete(Music t);

	void update(Music t);

	Music select();
	
}
