//package com.niit.CollaborationRestfulService.Controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.niit.CollaborationBackendProject.Service.UserService;
//import com.niit.CollaborationBackendProject.model.User;
//import com.niit.CollaborationBackendProject.model.Error; 
//@Controller
//public class UserController 
//{
//	@Autowired
//	UserService userService;
//	
//	@RequestMapping(value="/registeruser",method=RequestMethod.POST)
//	public  ResponseEntity<?> registeruser(@RequestBody User user)
//	{
//		if(!userService.isUsernameValid(user.getUsername()))
//		{
//			Error error=new Error(2,"Username already exists... please enter different username");
//			return new ResponseEntity<Error>(error,HttpStatus.NOT_ACCEPTABLE);
//		}
//		if(!userService.isEmailValid(user.getEmail()))
//		{
//			Error error=new Error(3,"Email address already exists..please enter different email");
//			return new ResponseEntity<Error>(error,HttpStatus.NOT_ACCEPTABLE);
//		}
//		
//		
//		boolean result=userService.registerUser(user);
//		if(result)
//		{
//			return new ResponseEntity<User>(user,HttpStatus.OK);//200-299
//		}
//		else
//		{
//			Error error=new Error(1,"Unable to register user details");
//			return new ResponseEntity<Error>(error,HttpStatus.INTERNAL_SERVER_ERROR);//500
//		}
//	}
//	
////	@RequestMapping(value="/logout",method=RequestMethod.PUT)
////	public ResponseEntity<?> logout(HttpSession session)
////	{
////		String username=(String)session.getAttribute("username");
////		System.out.println("Name of the user is"+username);
////		if(username==null)
////		{
////			Error error=new Error(5,"Unauthorized access..please login..");
////			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
////		}
//////		User user=userService.getUserByUsername(username);
//////		user.setOnline(false);
//////		userService.update(user);//online status is false
//////		session.removeAttribute("username");
//////		sess
//////		
//		
//	}
//
//
