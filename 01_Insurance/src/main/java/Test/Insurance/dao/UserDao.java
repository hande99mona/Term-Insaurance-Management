package Test.Insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Test.Insurance.model.Agent;
import Test.Insurance.model.PolicyHolder;
import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	@Query(value="select u from User u where u.username=:username And u.password=:password")
	 public User finduserName(@Param("username")String username,@Param("password")String password);


}
