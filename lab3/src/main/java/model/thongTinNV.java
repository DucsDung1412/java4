package model;

import java.util.ArrayList;
import java.util.Date;

public class thongTinNV {
	private String username;
	private Date date;
	private String live;
	private Boolean gender;
	private Boolean mary;
	private String[] like;
	private String note;
	private String image;
	
	

	public thongTinNV(String username, Date date, String live, Boolean gender, Boolean mary, String[] like, String note,
			String image) {
		this.username = username;
		this.date = date;
		this.live = live;
		this.gender = gender;
		this.mary = mary;
		this.like = like;
		this.note = note;
		this.image = image;
	}

	public thongTinNV() {

	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Boolean getMary() {
		return mary;
	}

	public void setMary(Boolean mary) {
		this.mary = mary;
	}

	public String[] getLike() {
		return like;
	}

	public void setLike(String[] like) {
		this.like = like;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
