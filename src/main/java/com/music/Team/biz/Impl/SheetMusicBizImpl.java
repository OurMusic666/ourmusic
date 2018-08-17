package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.SheetMusic;
import com.music.Team.biz.SheetMusicBiz;
import com.music.Team.dao.SheetMusicDao;
@Service
public class SheetMusicBizImpl implements SheetMusicBiz {

	@Autowired
	private SheetMusicDao sheetMusicDao;
	
	public void insert(SheetMusic t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(SheetMusic t) {
		// TODO Auto-generated method stub
		
	}

	public void update(SheetMusic t) {
		// TODO Auto-generated method stub
		
	}

	public SheetMusic select() {
		// TODO Auto-generated method stub
		return null;
	}

	public SheetMusicDao getSheetMusicDao() {
		return sheetMusicDao;
	}

	public void setSheetMusicDao(SheetMusicDao sheetMusicDao) {
		this.sheetMusicDao = sheetMusicDao;
	}

}
