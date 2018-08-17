package com.music.Team.biz;

import com.music.Team.bean.SheetMusic;

public interface SheetMusicBiz {

	void insert(SheetMusic t);

	void delete(SheetMusic t);

	void update(SheetMusic t);

	SheetMusic select();
	
	
}
