package com.music.Team.dao;

public interface BaseDao<T> {
	//增
	void insert(T t);
	//删
	void delete(T t);
	//改
	void update(T t);
	//查
	T select();
}
