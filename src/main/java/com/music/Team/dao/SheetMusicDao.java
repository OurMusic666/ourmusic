package com.music.Team.dao;

import com.music.Team.bean.SheetMusic;

public interface SheetMusicDao extends BaseDao<SheetMusic>{

	void insert(SheetMusic t);

	void delete(SheetMusic t);

	void update(SheetMusic t);

	SheetMusic select();
	
	
}
