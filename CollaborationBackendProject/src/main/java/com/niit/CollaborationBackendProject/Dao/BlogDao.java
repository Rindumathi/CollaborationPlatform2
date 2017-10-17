package com.niit.CollaborationBackendProject.Dao;

import java.util.List;

import com.niit.CollaborationBackendProject.model.Blog;
import com.niit.CollaborationBackendProject.model.BlogComment;
import com.niit.CollaborationBackendProject.model.User;

public interface BlogDao 
{
List<Blog> getBlogs();
Blog getBlog(int Blog_Id);
Blog addBlog(User user,Blog blog);
List<BlogComment> getBlogComments(int Blogc_Id);
Blog addBlogComment(User user,BlogComment blogComment);
}
