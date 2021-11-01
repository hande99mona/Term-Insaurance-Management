package Test.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;
import Test.Insurance.service.AdminServices;

@RestController
@RequestMapping(path="admin")
public class AdminController {
	
@Autowired
AdminServices adminServices =null;
 // http://localhost:9090/insurance-api/admin     

@GetMapping
public ResponseEntity<Object> getAllAgents(){
	ResponseEntity<Object> response =null; 
	List<Agent> list=adminServices.findAllAgent();
	if(!list.isEmpty()) {
		 response=new ResponseEntity<Object>(list,HttpStatus.CREATED);
	}
	return response; 
}


@GetMapping(path= "{/getplans}")
public ResponseEntity<Object> getAllPlans(){
	ResponseEntity<Object> response =null; 
	List<Policyplan> list=adminServices.findAllpolicies();
	if(!list.isEmpty()) {
		 response=new ResponseEntity<Object>(list,HttpStatus.CREATED);
	}
	return response; 
}


@PostMapping
public ResponseEntity<Object> saveAgent(@RequestBody Agent agent ) {
	ResponseEntity<Object> response =null; 
	
	adminServices.addAgent(agent);
	if(agent.getAgentId()!=0){
		
		   response=new ResponseEntity<Object>( agent,HttpStatus.CREATED);
         
	}
	 return response;
	
}

@PostMapping(path="{/saveplan}")
public ResponseEntity<Object> savePlan(@RequestBody Policyplan plan ) {
	ResponseEntity<Object> response =null; 
	
	adminServices.addPolicy(plan);
	if(plan.getPlanId()!=0){
		
		   response=new ResponseEntity<Object>( plan,HttpStatus.CREATED);
         
	}
	 return response;
	
}

@PutMapping
public ResponseEntity<Agent>modifyAgent(@RequestBody Agent agent){
	
	agent=adminServices.modifyAgent(agent);
	ResponseEntity<Agent> response= new ResponseEntity<Agent>(agent,HttpStatus.OK);
	return response ;

}

@PutMapping(path="{/modifyplan}")
public ResponseEntity<Policyplan>modifyPlan(@RequestBody Policyplan plan){
	
	plan=adminServices.modifyPolicy(plan);
	ResponseEntity<Policyplan> response= new ResponseEntity<Policyplan>(plan,HttpStatus.OK);
	return response ;

}


@DeleteMapping(path="{agentId}")
public void deleteAgent(@PathVariable("agentId")int id) {
	adminServices.removeAgent(id);
	
	
}

@DeleteMapping(path="{policyId}")
public void deletePlan(@PathVariable("policyId")int id) {
	adminServices.removePolicy(id);
	
	
}


@GetMapping(path="{userName}/{password}")
public boolean checkLogin(String userName,String password) {
	boolean result=adminServices.adminLogin(userName, password);
	return result;
	
	
	
}



}
