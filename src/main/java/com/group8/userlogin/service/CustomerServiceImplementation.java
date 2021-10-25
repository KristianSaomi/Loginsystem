package com.group8.userlogin.service;

import com.group8.userlogin.model.Customer;
import com.group8.userlogin.respository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
    private CustomerRespository customerRespository;



    @Override
    public List<Customer> getAllCustomerList(){
        return customerRespository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRespository.save(customer);
    }



}



