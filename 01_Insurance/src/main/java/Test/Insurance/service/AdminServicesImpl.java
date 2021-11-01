package Test.Insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import Test.Insurance.dao.AgentDao;
import Test.Insurance.dao.PolicyPlanDao;
import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;



@Service
@Scope(scopeName="singleton")
public class AdminServicesImpl implements AdminServices {
	
	@Autowired
	PolicyPlanDao policydao=null;
	@Autowired
	AgentDao agentdao=null;

	@Override
	public boolean adminLogin(String userName, String password) {
		if(userName.equals("admin")&& password.equals("password")) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void addPolicy(Policyplan plan) {
		policydao.save(plan);
	}

	@Override
	@Transactional
	public void addAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentdao.save(agent);
	}

	@Override
	@Transactional
	public Agent modifyAgent(Agent agent) {
		 agent.setAgentIncome(20000);
		
		return agentdao.save(agent);
	}

	@Override
	@Transactional
	public Policyplan modifyPolicy(Policyplan plan) {
		plan.setPlanName("xyz");
		 return policydao.save(plan);
	}

	@Override
	public List<Agent> findAllAgent() {
		
		return agentdao.findAll();
	}

	@Override
	public List<Policyplan> findAllpolicies() {
		// TODO Auto-generated method stub
		return  policydao.findAll();
	}

	@Override
	@Transactional
	public void removeAgent(int id) {
		agentdao.deleteById(id);
		
	}

	@Override
	@Transactional
	public void removePolicy(int id) {
		policydao.deleteById(id);		
	}
	

}
