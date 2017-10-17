package com.niit.CollaborationBackendProject.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="blog_s180015")
public class Blog 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Blog_Id;
	private Date createdOn;
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="create_by_id")
	private User createdBy;
	private String title;
	@Lob
	private String body;
	
	@OneToMany(mappedBy="blog",fetch=FetchType.EAGER,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<BlogComment> comments=new ArrayList<BlogComment>();

	public int getBlog_Id() {
		return Blog_Id;
	}

	public void setBlog_Id(int blog_Id) {
		Blog_Id = blog_Id;
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

	public List<BlogComment> getComments() {
		return comments;
	}

	public void setComments(List<BlogComment> comments) {
		this.comments = comments;
	}
	
	
	
}
