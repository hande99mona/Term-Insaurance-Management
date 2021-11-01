package Test.Insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Test.Insurance.model.Policyplan;
import Test.Insurance.model.User;

@Repository
public interface PolicyPlanDao extends JpaRepository<Policyplan, Integer> {

}
