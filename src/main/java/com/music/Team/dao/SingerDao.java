package com.music.Team.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Singer;
@Service
public interface SingerDao extends BaseDao<Singer>{

	@Insert("insert singer music values(null,#{singer_name},#{singer_pic},#{singer_desc})")
	@Options(useGeneratedKeys=true,keyProperty="singer_id",keyColumn="singer_id")
	void insert(Singer t);

	void delete(Singer t);

	void update(Singer t);

	Singer select();
	
	
}
