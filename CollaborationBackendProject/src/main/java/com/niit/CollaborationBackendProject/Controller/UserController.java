//package com.niit.CollaborationBackendProject.Controller;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
//import org.jboss.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.niit.CollaborationBackendProject.Dao.FileUploadDao;
//import com.niit.CollaborationBackendProject.Dao.UserDao;
//import com.niit.CollaborationBackendProject.model.UploadFile;
//import com.niit.CollaborationBackendProject.model.User;
//import com.niit.CollaborationBackendProject.model.Error;
//
//
//@RestController
//public class UserController 
//{
//	Logger logger=LoggerFactory.getLogger(this.getClass());
//	@Autowired
//	private UserDao userDao;
//	@Autowired
//	private FileUploadDao fileUploadDao;
//	
//	public UserDao getUserDao()
//	{
//		return userDao;
//	}
//	public void setUserDao(UserDao userDao)
//	{
//		this.userDao=userDao;
//	}
//	
//@RequestMapping(value="/login",method=RequestMethod.POST)
//public ResponseEntity<?> login(@RequestBody User user,HttpSession session)
//{
//	logger.debug("Entering USERCONTROLLER:LOGIN");
//	System.out.println("11111111111");
//	logger.debug("USERNAME:"+user.getUsername()+"PASSWORD"+user.getPassword());
//	User validUser=userDao.authenticate(user);
//	if(validUser==null)
//	{
//		logger.debug("validUser is null");
//		Error error=new Error(1,"Username and password doesnot exists...");
//		return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);//401
//	}
//	else
//	{
//		session.setAttribute("user",validUser);
//		validUser.setOnline(true);
//		userDao.updateUser(validUser);//to update online status in db
//		logger.debug("validUser is not null");
//		
//		UploadFile getUploadFile=fileUploadDao.getFile(user.getUsername());
//		if(getUploadFile!=null)
//		{
//			String name=getUploadFile.getFileName();
//			System.out.println(getUploadFile.getFileName());
//			byte[] imagefiles=getUploadFile.getData();
//			try {
//				String path="C:/workspace2/"+user.getUsername();
//				File file=new File(path);
//				FileOutputStream fos=new FileOutputStream(file);//to write some data
//				fos.write(imagefiles);
//				fos.close();
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		   return new ResponseEntity<User>(validUser,HttpStatus.OK);
//	}
//}
//@RequestMapping(value="/register", method=RequestMethod.POST)
//public ResponseEntity<?> registerUser(@RequestBody User user)
//{
//	try
//	{
//		logger.debug("USERCONTROLLER =>REGISTER" +user);
//		//user.setStatus(true);
//		user.setOnline(false);
//		User savedUser =userDao.registerUser(user);
//		logger.debug("User Id generated is" + savedUser.getUsr_Id());
//		if(savedUser.getUsr_Id()==0)
//		{
//			Error error=new Error(2,"Couldn't insert user details");
//			return new ResponseEntity<Error>(error,HttpStatus.CONFLICT);
//		}
//		else
//		{
//			return new ResponseEntity<User>(savedUser,HttpStatus.OK);
//		}
//	}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			Error error=new Error(2,"Couldn't insert user details.Cannot have null/duplicate values"+e.getMessage());
//			return new ResponseEntity<Error>(error,HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	
//}
//	@RequestMapping(value="/logout", method=RequestMethod.PUT)
//	public ResponseEntity<?> logout(HttpSession session)
//	{
//		User user=(User)session.getAttribute("user");
//		if(user!=null)
//		{
//			user.setOnline(false);
//			userDao.updateUser(user);
//		}
//		try
//		{
//			String path="C:/work"+user.getUsername();
//			File file=new File(path);
//			System.out.println(file.delete());
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	
//	session.removeAttribute("user");
//	session.invalidate();
//	return new ResponseEntity<Void>(HttpStatus.OK);
//	}
//@RequestMapping(value="/getUsers",method=RequestMethod.GET)
//public ResponseEntity<?> getAllUsers(HttpSession session)
//{
//	User user=(User)session.getAttribute("user");
//	if(user==null)
//		return new ResponseEntity<Error>(new Error(1,"Unauthorized user"),HttpStatus.UNAUTHORIZED);
//	else
//	{
//		List<User> users=userDao.getAllUsers(user);
//		for(User u: users)
//		{
//			System.out.println("IsOnline" +u.isOnline());
//		}
//		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
//	}
//}
//
//
//}
//
