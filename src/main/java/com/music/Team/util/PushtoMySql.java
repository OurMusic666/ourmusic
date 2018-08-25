package com.music.Team.util;

import java.util.ArrayList;

import com.music.Team.bean.MusicInfo;

public class PushtoMySql {
	public static void pushtoMysql(String path) {
		ArrayList<MusicInfo> list=SongsBuilder.getMusic(path);
		
	}
}
