package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "company")
public class CompanyPost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;

	@Transient
	private Integer ufk;

	private String title;
	private String body;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "companypost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comment> comments;

	public CompanyPost() {

	}

	public CompanyPost(Integer pid, String title, String body, User user) {
		super();
		this.pid = pid;
		this.title = title;
		this.body = body;
		this.user = user;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getUfk() {
		return ufk;
	}

	public void setUfk(Integer ufk) {
		this.ufk = ufk;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "CompanyPost [pid=" + pid + ", title=" + title + ", body=" + body + ", user=" + user + "]";
	}

}
