package Test.Insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Test.Insurance.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
