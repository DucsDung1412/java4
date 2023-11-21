package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class favorites {
	@Id
	@GeneratedValue
	private Integer id;
	private Date likeDate;
	
	@ManyToOne
	@JoinColumn(name = "userID")
	private users userID;
	
	@ManyToOne
	@JoinColumn(name = "video")
	private videos video;

	public favorites(Integer id, Date likeDate, users user, videos video) {
		this.id = id;
		this.likeDate = likeDate;
		this.userID = user;
		this.video = video;
	}

	public favorites() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}

	public users getUser() {
		return userID;
	}

	public void setUser(users user) {
		this.userID = user;
	}

	public videos getVideo() {
		return video;
	}

	public void setVideo(videos video) {
		this.video = video;
	}
}
