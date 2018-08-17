package com.music.Team.biz.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.Team.bean.Sheet;
import com.music.Team.biz.SheetBiz;
import com.music.Team.dao.SheetDao;
@Service
public class SheetBizImpl implements SheetBiz {

	@Autowired
	private SheetDao sheetDao;
	
	public void insert(Sheet t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Sheet t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Sheet t) {
		// TODO Auto-generated method stub
		
	}

	public Sheet select() {
		// TODO Auto-generated method stub
		return null;
	}

	public SheetDao getSheetDao() {
		return sheetDao;
	}

	public void setSheetDao(SheetDao sheetDao) {
		this.sheetDao = sheetDao;
	}

}
