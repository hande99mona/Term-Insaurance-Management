package Test.Insurance.service;

import java.util.List;

import org.omg.CORBA.PolicyHolder;

import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;

public interface UserServices {
	
	 public void userRegistration(User user);
	 public boolean userlogin(String username,String password);
	 public List<Policyplan> findallpolicyplan();
	 public List<Agent>findAgent();
	 public List<PolicyHolder>findmyappliactionById();
	//boolean userlogin(int id, String username, String password);
	 
	 
	 

}
