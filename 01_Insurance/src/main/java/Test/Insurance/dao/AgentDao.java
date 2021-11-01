package Test.Insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Test.Insurance.model.Agent;

@Repository
public interface AgentDao extends JpaRepository<Agent, Integer> {
	

}
