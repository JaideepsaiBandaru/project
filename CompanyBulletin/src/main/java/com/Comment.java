package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "comment")

public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer commentId;

	@Transient
	private Integer fk;
	private String commentText;

	@ManyToOne
	private CompanyPost companypost;

	public Comment() {
	}

	public Comment(Integer commentId, String commentText, CompanyPost companypost) {
		this.commentId = commentId;
		this.commentText = commentText;
		this.companypost = companypost;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getFk() {
		return fk;
	}

	public void setFk(Integer fk) {
		this.fk = fk;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	@JsonIgnore
	public CompanyPost getCompanypost() {
		return companypost;
	}

	public void setCompanypost(CompanyPost companypost) {
		this.companypost = companypost;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentText=" + commentText + ", companypost=" + companypost
				+ "]";
	}

}
