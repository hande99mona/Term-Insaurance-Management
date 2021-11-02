package Test.Insurance.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Test.Insurance.model.PolicyHolder;

@Repository
public interface PolicyHolderDao extends JpaRepository<PolicyHolder, Integer> {

	@Query(value="select  p from PolicyHolder p where p.ph_FullName=:name")
	List<PolicyHolder> findByName(@Param("name")String name);

  

}
