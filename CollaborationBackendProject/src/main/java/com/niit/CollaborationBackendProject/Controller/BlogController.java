//package com.niit.CollaborationBackendProject.Controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.http.HttpStatus;
//
//@RestController
//@RequestMapping("/blog")
//public class BlogController 
//{
//@Autowired
//private BlogDao blogDao;
// 
//@RequestMapping(method=RequestMethod.GET,value="/list")
//public ResponseEntity<?> getBlogList(HttpSession session)
//{
//	User user=(User)session.getAttribute("user");
//	if(user==null)
//	{
//		Error error=new Error(1,"Unauthorized user");
//		return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
//	}
//}
//}
