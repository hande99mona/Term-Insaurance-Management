package Test.Insurance.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import Test.Insurance.dao.AddressDao;
import Test.Insurance.dao.AgentDao;
import Test.Insurance.dao.PaymentDao;
import Test.Insurance.dao.PolicyHolderDao;
import Test.Insurance.dao.PolicyPlanDao;
import Test.Insurance.dao.UserDao;
import Test.Insurance.model.Address;
import Test.Insurance.model.Agent;
import Test.Insurance.model.Payment;
import Test.Insurance.model.PolicyHolder;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;


@Service
@Scope(scopeName="singleton")
public class UserServicesImpl implements UserServices {
	 @Autowired
	  UserDao userDao=null;
	 @Autowired
	 AddressDao addressDao=null;
	@Autowired
	 PolicyPlanDao policyPlanDao=null;
	@Autowired
	PolicyHolderDao policyHolderDao=null;
	@Autowired
	  AgentDao agentDao=null;
	@Autowired
	 PaymentDao paymentDao=null;

	@Override
	@Transactional
	public void userRegistration(User user) {
		
		Optional<Address> optional = addressDao.findById(user.getAddress().getAddress_Id());
		if(!optional.isPresent()) {
			addressDao.save(user.getAddress());
		}
		user.getAddress();
		userDao.save(user);
		//userDao.save(user);
		
	}

	@Override
	public boolean userlogin( String username,  String password) {
		User user=userDao.finduserName( username,password);
		if(user!=null) {
			return true;
		}
		else {
			
		return false;
		}		
		 
	}

	

	
	@Override
    @Transactional
	public void applyPolicy(PolicyHolder holder) {
	
		Optional<Policyplan> optional = policyPlanDao.findById(holder.getPolicy().getPlanId());
		if(!optional.isPresent()) {
			policyPlanDao.save(holder.getPolicy());
		}
		Optional<Agent> optional1 = agentDao.findById(holder.getAgent().getAgentId());
		if(!optional1.isPresent()) {
			agentDao.save(holder.getAgent());
		}
		holder.getPolicy();
		holder.getAgent();
		policyHolderDao.save(holder);
		//userDao.save(user);
		
	}

	@Override
	@Transactional	
	public void makePayment(Payment payment) {
		
		Optional<Policyplan> optional = policyPlanDao.findById(payment.getPlan().getPlanId());
		if(!optional.isPresent()) {
			policyPlanDao.save(payment.getPlan());
		}
		
		Optional<PolicyHolder> optional1 = policyHolderDao.findById(payment.getPolicyHolder().getPh_id());
		if(!optional1.isPresent()) {
			policyHolderDao.save(payment.getPolicyHolder());
		}
	
		paymentDao.save(payment);
		
	}

	@Override
	public List<Agent> findAllAgent() {
		// TODO Auto-generated method stub
		return agentDao.findAll();
	}

	@Override
	public List<Policyplan> findAllpolicies() {
		// TODO Auto-generated method stub
		return policyPlanDao.findAll();
	}

	@Override
	public List<PolicyHolder> findmyappliactionByName(String name) {
		return policyHolderDao.findByName(name);
		 
	}

	


	

	
	


	
	
}
