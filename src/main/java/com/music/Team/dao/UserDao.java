package com.music.Team.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.music.Team.bean.User;

public interface UserDao extends BaseDao<User> {
	
	void insert(User t);

	void delete(User t);

	void update(User t);

	User select();
	
	@Insert("insert into music_user values (null,#{user_name},#{user_pwd},"
			+ "#{user_email},#{user_isMember})")
	@Options(useGeneratedKeys=true,keyColumn="user_id",keyProperty="user_id")
	void insertUser(User user);
	
	@Select("select  * from music_user where user_email = #{user_email}")
	User selectEmail(String user_email);
	
	
	@Select("select  * from music_user where user_name = #{user_name}")
	User selectName(String user_name);

	@Select("select  * from music_user where user_email = #{user_email} and "
					+ "user_pwd = #{user_pwd}")
	User selectUser(@Param("user_email")String user_name,@Param("user_pwd")String user_pwd);
	
}
