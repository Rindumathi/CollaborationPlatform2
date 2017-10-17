package com.niit.CollaborationBackendProject.Dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CollaborationBackendProject.model.UploadFile;

@Repository
public class FileUploadDaoImpl implements FileUploadDao
{

	@Autowired
	private SessionFactory sessionFactory;
	
	public FileUploadDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public void save(UploadFile uploadFile) 
	{
		Session session=sessionFactory.openSession();
		session.save(uploadFile);
		session.flush();
		session.close();
		
	}

	public UploadFile getFile(String username) 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from UploadFile where username=?");
		query.setParameter(0, username);
		UploadFile uploadFile=(UploadFile)query.uniqueResult();
		session.close();
		return uploadFile;
	}

}
