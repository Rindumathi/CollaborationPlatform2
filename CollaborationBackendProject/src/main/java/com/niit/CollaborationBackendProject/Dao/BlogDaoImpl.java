package com.niit.CollaborationBackendProject.Dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.CollaborationBackendProject.model.Blog;
import com.niit.CollaborationBackendProject.model.BlogComment;
import com.niit.CollaborationBackendProject.model.User;


@Repository("blogDao")
@Transactional
public class BlogDaoImpl implements BlogDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	public List<Blog> getBlogs() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Blog");
		List<Blog> blogs=query.list();
		session.close();
		return blogs;
	}

	public Blog getBlog(int Blog_Id) 
	{
		Session session=sessionFactory.openSession();
		Blog blogs=(Blog)session.get(Blog.class, Blog_Id);
		session.close();
		return blogs;
	}

	public Blog addBlog(User user, Blog blog) 
	{
		Session session=sessionFactory.openSession();
		blog.setCreatedBy(user);
		blog.setCreatedOn(new Date());
		session.save(blog);
		session.flush();
		Blog addedBlog=(Blog)session.get(Blog.class,blog.getBlog_Id());
		return addedBlog;
	}

	public List<BlogComment> getBlogComments(int Blogc_Id) 
	{
		Session session=sessionFactory.openSession();
		Blog blog=(Blog)session.get(Blog.class,Blogc_Id);
		List<BlogComment> blogComments=blog.getComments();
		session.close();
		return blogComments;
	}

	public Blog addBlogComment(User user, BlogComment blogComment) 
	{
		Session session =sessionFactory.openSession();
		blogComment.setCreatedBy(user);
		blogComment.setCreatedOn(new Date());
		Blog blog=(Blog)session.get(Blog.class,blogComment.getBlogPost().getBlog_Id());
		blogComment.setBlogPost(blog);
		session.merge(blogComment);
		session.flush();
		session.close();
		return blog;
	}

}
