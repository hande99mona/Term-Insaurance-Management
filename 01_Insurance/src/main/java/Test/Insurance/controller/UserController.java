package Test.Insurance.controller;

import java.util.List;
import java.util.Optional;

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
import Test.Insurance.model.Payment;
import Test.Insurance.model.PolicyHolder;
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
	 
	 
	 @PostMapping(path="{ /Apply}")
	 public ResponseEntity<Object>applytopolicy(@RequestBody PolicyHolder holder ) {
	 	ResponseEntity<Object> response =null; 
	 	userServices.applyPolicy(holder);
	 	
	 	if(holder.getPh_id()!=0){
	 		
	 		   response=new ResponseEntity<Object>(holder,HttpStatus.CREATED);
	          
	 	}
	 	 return response;
	 	
	 }
	 

	 @PostMapping(path="{ /makePayment}")
	 public ResponseEntity<Object>makePayment(@RequestBody Payment payment ) {
	 	ResponseEntity<Object> response =null; 
	 	userServices.makePayment(payment);;
	 	
	 	if(payment.getPaymentId()!=0){
	 		
	 		   response=new ResponseEntity<Object>(payment,HttpStatus.CREATED);
	          
	 	}
	 	 return response;
	 	
	 }
	 
	 
	 @GetMapping(path="{/getagents}")
	 public ResponseEntity<Object> getAllAgents(){
	 	ResponseEntity<Object> response =null; 
	 	List<Agent> list=userServices.findAllAgent();
	 	if(!list.isEmpty()) {
	 		 response=new ResponseEntity<Object>(list,HttpStatus.CREATED);
	 	}
	 	return response; 
	 }


	 @GetMapping(path= "{/getplans}")
	 public ResponseEntity<Object> getAllPlans(){
	 	ResponseEntity<Object> response =null; 
	 	List<Policyplan> list=userServices.findAllpolicies();
	 	if(!list.isEmpty()) {
	 		 response=new ResponseEntity<Object>(list,HttpStatus.CREATED);
	 	}
	 	return response; 
	 }

	 @GetMapping(path= "{/myApplications}/{name}")
	 public ResponseEntity<Object>getapplicationHistory(@PathVariable("name") String name){
	 	ResponseEntity<Object> response =null; 
	 	List<PolicyHolder> list=userServices.findmyappliactionByName(name);
	 	if(!list.isEmpty()) {
	 		 response=new ResponseEntity<Object>(list,HttpStatus.CREATED);
	 	}
	 	return response; 
	 }

}
