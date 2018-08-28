package com.music.Team.bean;

public class MusicInfo {
	private String singer;
	private String album;
	private String name;
	private String url;
	private String pic;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "MusicInfo [singer=" + singer + ", album=" + album + ", name=" + name + ", url=" + url + ", pic=" + pic
				+ "]";
	}
}
