package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class videos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String poster;
	private String description;
	private Boolean active;
	private Integer view;
	
	@OneToMany(mappedBy = "video", cascade = CascadeType.ALL)
	private List<favorites> listF;

	public videos(Integer id, String title, String poster, String description, Boolean active, Integer view) {
		this.id = id;
		this.title = title;
		this.poster = poster;
		this.description = description;
		this.active = active;
		this.view = view;
	}

	public videos() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getView() {
		return view;
	}

	public void setView(Integer view) {
		this.view = view;
	}

	public List<favorites> getListF() {
		return listF;
	}

	public void setListF(List<favorites> listF) {
		this.listF = listF;
	}
}
