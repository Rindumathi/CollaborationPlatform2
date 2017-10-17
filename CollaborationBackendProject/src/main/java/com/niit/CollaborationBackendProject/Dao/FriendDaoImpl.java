package com.niit.CollaborationBackendProject.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CollaborationBackendProject.model.Friend;


@Repository
public class FriendDaoImpl implements FriendDao
{
@Autowired
private SessionFactory sessionFactory;

	public List<Friend> getAllFriends(String username) 
	{
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from Friend where (to_Id=? or from_Id=?) and status=?");
	query.setString(0,username);
	query.setString(1, username);
	query.setCharacter(2,'A');
	List friends=query.list();
	session.close();
	return friends;
	}

	public void sendFriendRequest(String from, String to) 
	{
		Session session=sessionFactory.openSession();
		Friend friend=new Friend();
		friend.setFrom_Id(from);
        friend.setTo_Id(to);
        friend.setStatus('P');
        session.save(friend);
        session.flush();
        session.close();
    }

	public List<Friend> getPendingRequest(String username)
	{
		Session session=sessionFactory.openSession();
		Query query =session.createQuery("from Friend where to_Id=? and status=?");
		query.setString(0,username);
		query.setCharacter(1,'P');
		List<Friend> pendingRequest=query.list();
		session.close();
		return pendingRequest;
	}

	public void updatePendingRequest(char Status, String from_Id, String to_Id) 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("update Friend set status=? where from_Id=? and to_Id=?");
        query.setCharacter(0,Status);
        query.setString(1,from_Id);
        query.setString(2,to_Id);
        int count=query.executeUpdate();
        System.out.println("Number of records updated" +count);
        session.flush();
        session.close();
	}

}
