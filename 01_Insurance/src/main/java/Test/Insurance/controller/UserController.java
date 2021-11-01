package Test.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;
import Test.Insurance.service.UserServices;

@RestController
@RequestMapping(path="user")
public class UserController {
	 @Autowired
	UserServices userServices=null;
	 
	 @PostMapping
	 public ResponseEntity<Object>registerUser(@RequestBody User user ) {
	 	ResponseEntity<Object> response =null; 
	 	userServices.userRegistration(user);
	 	
	 	if(user.getId()!=0){
	 		
	 		   response=new ResponseEntity<Object>(user,HttpStatus.CREATED);
	          
	 	}
	 	 return response;
	 	
	 }
	 
	 @GetMapping(path="{username}/{password}")
	 public boolean userLogin(@PathVariable("username") String username,@PathVariable("password")String password){
			
			boolean result =userServices.userlogin(username, password);
			
	 return result;
	 }
}
