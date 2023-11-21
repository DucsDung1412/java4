package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String password;
	private String fullname;
	private String email;
	private Boolean admin = false;
	
	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL)
	private List<favorites> listF;
	
	public users() {

	}

	public users(Integer id, String password, String fullname, String email, Boolean admin) {
		this.id = id;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public List<favorites> getListF() {
		return listF;
	}

	public void setListF(List<favorites> listF) {
		this.listF = listF;
	}
}
