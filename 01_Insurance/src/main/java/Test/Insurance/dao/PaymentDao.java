package Test.Insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Test.Insurance.model.Payment;
import Test.Insurance.model.PolicyHolder;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer> {



}
