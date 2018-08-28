package com.music.Team.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.music.Team.bean.Singer;

public interface SingerDao extends BaseDao<Singer>{

	@Insert("insert into singer values (null,#{singer_name},#{singer_desc})")
	@Options(useGeneratedKeys=true,keyProperty="singer_id",keyColumn="singer_id")
	void insert(Singer singer);

	void delete(Singer singer);

	void update(Singer singer);

	Singer select();
}
