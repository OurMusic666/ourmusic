package com.music.Team.biz;

import com.music.Team.bean.Album;

public interface AlbumBiz {

	void insert(Album t);

	void delete(Album t);

	void update(Album t);

	Album select();
	
}
