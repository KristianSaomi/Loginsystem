package com.group8.userlogin.respository;

import com.group8.userlogin.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Long> {

}
