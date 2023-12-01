package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-generator")
	@GenericGenerator(name = "custom-generator", strategy = "customGenerator.userGenerator")
	private String userId;

	private String password;
	private String fullname;
	private String email;
	private String username;
	private String avata;
	private Boolean admin = false;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<favorites> listF;
	
	public user() {

	}
	
	public user(String userId, String password, String fullname, String email, String username, String avata,
			Boolean admin) {
		this.userId = userId;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.avata = avata;
		this.admin = admin;
	}

	public String getId() {
		return userId;
	}

	public void setId(String id) {
		this.userId = id;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvata() {
		return avata;
	}

	public void setAvata(String avata) {
		this.avata = avata;
	}

	public List<favorites> getListF() {
		return listF;
	}

	public void setListF(List<favorites> listF) {
		this.listF = listF;
	}
}
