package Test.Insurance.service;

import java.util.List;
import java.util.Optional;

import Test.Insurance.model.Agent;
import Test.Insurance.model.Payment;
import Test.Insurance.model.PolicyHolder;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;

public interface UserServices {
	
	 public void userRegistration(User user);
	 public boolean userlogin(String username,String password);
	
	 public List<PolicyHolder> findmyappliactionByName(String name);
	 
	public void applyPolicy(PolicyHolder holder);
	 public void makePayment(Payment payment);
	 
	 public List<Agent>findAllAgent();
	   public List<Policyplan>findAllpolicies();
	 
	
	 
	 
	 

}
