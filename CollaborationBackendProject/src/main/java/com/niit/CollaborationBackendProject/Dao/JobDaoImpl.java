package com.niit.CollaborationBackendProject.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CollaborationBackendProject.model.Job;

@Repository
public class JobDaoImpl implements JobDao 
{
@Autowired
private SessionFactory sessionFactory;
 
public SessionFactory getSessionFactory()
{
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
	public void postJob(Job job) 
	{
		Session session=sessionFactory.openSession();
		session.save(job);
		session.flush();
		session.close();
	}

	public List<Job> getAllJobs() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Job");
		List<Job> jobs=query.list();
		session.close();
		return jobs;
	}

	public Job getJobDetail(int Job_Id) 
	{
	 Session session=sessionFactory.openSession();
	 Job job=(Job)session.get(Job.class,Job_Id);
	 session.close();
	 return job;
	}

}
