package com.niit.CollaborationBackendProject.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogComment_s180015")
public class BlogComment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Blogc_Id;
	private Date createdOn;
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="create_by_id")
	private User createdBy;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="blog_Post_id")
	private Blog blogPost;
	private String body;
	public int getBlogc_Id() {
		return Blogc_Id;
	}
	public void setBlogc_Id(int blogc_Id) {
		Blogc_Id = blogc_Id;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Blog getBlogPost() {
		return blogPost;
	}
	public void setBlogPost(Blog blogPost) {
		this.blogPost = blogPost;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
		
}
