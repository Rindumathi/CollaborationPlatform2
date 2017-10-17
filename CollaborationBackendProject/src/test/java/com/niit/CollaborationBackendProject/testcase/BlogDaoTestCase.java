package com.niit.CollaborationBackendProject.testcase;

import java.util.List;

import org.junit.BeforeClass;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackendProject.Dao.BlogDao;
import com.niit.CollaborationBackendProject.model.Blog;
import com.niit.CollaborationBackendProject.model.BlogComment;
import com.niit.CollaborationBackendProject.model.User;

import junit.framework.TestCase;


public class BlogDaoTestCase extends TestCase 
{
	static User user;
  static BlogDao blogDao;
  static List<BlogComment> blogCommentlist;
  
  @Autowired
  User user1;
  
  @Autowired
  List<BlogComment> blogCommentlist1;
  
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit.CollaborationBackend");
		annotationConfigApplicationContext.refresh();
		blogDao =(BlogDao)annotationConfigApplicationContext.getBean("blogDao");
	}
	@Test
	public void testCreateBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlog_Id(1001);
		blog.setBody("Java");
		blog.setComments(blogCommentlist1);
		blog.setCreatedBy(user1);
		blog.setCreatedOn(new java.util.Date());
		blog.setTitle("title");
		blogDao.addBlog(user1, blog);
//		assertTrue("Problem in Blog Creation",blogDao.CreateBlog(blog));
	}
	
//	@Test
//	@Ignore
//	public void approveBlogTest()
//	{
//		Blog blog=new Blog();
//		blog.setBlog_Id(1001);
//		blog.setBlog_Name("Selenium");
//		blog.setBlog_Content("Selenium is a testing tool");
//		blog.setBlog_Status("NA");
//		blog.setBlog_Username("Madhu");
//		blog.setLikes(0);
//		blog.setCreateDate(new java.util.Date());
//		assertTrue("Problem in Approving Blog",blogDao.approveBlog(blog));
//	}
//	@Test
//	@Ignore
//	public void getAllApprovedBlogTest()
//	{
//		List<Blog> listBlog =blogDao.getBlog();
//		assertTrue("No Approved Blog",listBlog.size()>0);	
//	}
//	 @Test
//	 @Ignore
//	 public void deleteBlogTest()
//	 {
//		 assertTrue("Problem in Deleting",blogDao.deleteBlog(1001));
//	 }
//	 
//	 @Test
//	 @Ignore
//	 public void getBlogByBlodId()
//	 {
//		 assertNotNull("Problem getting blog",blogDao.getBlog(1003));
//	 }
	}


