package Test.Insurance.service;

import java.util.List;

import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;


public interface AdminServices {
	
	
	
	public  void addPolicy(Policyplan plan);
	public  void addAgent(Agent agent);
	
	  public Agent modifyAgent(Agent agent);
	  public Policyplan modifyPolicy(Policyplan plan);
	  
	   public List<Agent>findAllAgent();
	   public List<Policyplan>findAllpolicies();
	   
	   public void removeAgent(int id);
	   public void removePolicy( int id);

	boolean adminLogin(String userName, String password);
	   
	   
	   
	   
	  
	  
	
	
	
}
