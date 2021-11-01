package Test.Insurance.service;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Null;

import org.omg.CORBA.PolicyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import Test.Insurance.dao.UserDao;
import Test.Insurance.model.Agent;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;

@Service
@Scope(scopeName="singleton")
public class UserServicesImpl implements UserServices {
	 @Autowired
	  UserDao userDao=null;

	@Override
	public void userRegistration(User user) {
		userDao.save(user);
		
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
	public List<Policyplan> findallpolicyplan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agent> findAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PolicyHolder> findmyappliactionById() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
