package com.niit.CollaborationBackendProject.testcase;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackendProject.Dao.UserDao;
import com.niit.CollaborationBackendProject.model.User;

import junit.framework.TestCase;



public class UserDaoTestCase extends TestCase
{
	static User user;
static UserDao userDao;

	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit.CollaborationBackendProject");
		annotationConfigApplicationContext.refresh();
		userDao=(UserDao)annotationConfigApplicationContext.getBean("userDao"); 
	}

//@Test
//
//public void testUpdateUserTest()
//{
//	
//	System.out.println("Working");
//	User user=new User();
//	user.setUsr_Id(101);
//	user.setUsername("indu");
//	user.setPassword("indu");
//	user.setRole("null");
//	user.setPhonenumber("8754342152");
//	user.setFirstname("indu");
//	user.setLastname("sri");
//	user.setOnline(true);
//	user.setEmail("indu@gmail.com");
//	if(userDao.registerUser(user))
//	else
//	{
//		
//	}
//	System.out.println("Problem in user updation");
//	assertTrue("Problem in User Updation", userDao.updateUser(user));
//}


@Test

public void testregisterUserTest()
{
	User user=new User();
	user.setUsr_Id(103);
	user.setUsername("indusri");
	user.setPassword("indu");
	user.setRole("null");
	user.setPhonenumber("8754342152");
	user.setFirstname("indu");
	user.setLastname("sri");
	user.setOnline(true);
	user.setEmail("indu94@gmail.com");
	userDao.registerUser(user);
	System.out.println("User saved");
	
//assertTrue("Problem in Registering User",userDao.registerUser(user));	
}
//@Test
//@Ignore
//public void getAllApprovedUserTest()
//{
//	List<User> listUser=userDao.getAllUsers(user);
//	assertTrue("No Approved User",listUser.size()>0);	
//}
// @Test
// public void deleteUserTest()
// {
//	 assertTrue("Problem in Deleting",userDao.);
// }
// 
// @Test
// public void getUserByUserId()
// {
//	 assertNotNull("Problem getting User",userDao.getAllUsers(user));
// }

}