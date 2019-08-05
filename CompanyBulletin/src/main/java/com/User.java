package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "authenticate")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uid;

	@Column(unique = true)
	private String username;

	private String firstName;
	private String lastName;
	private String mnumber;
	private String password;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CompanyPost> companyposts;

	public User() {

	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMnumber() {
		return mnumber;
	}

	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<CompanyPost> getCompanyposts() {
		return companyposts;
	}

	public void setCompanyposts(List<CompanyPost> companyposts) {
		this.companyposts = companyposts;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mnumber=" + mnumber + ", password=" + password + "]";
	}

}
