package com.group8.userlogin.service;

import com.group8.userlogin.model.Customer;
import com.group8.userlogin.respository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer exitingCustomer = customerRespository.findById(customer.getId()).orElse((null));
        exitingCustomer.setFirstname(customer.getFirstname());
        exitingCustomer.setLastname(customer.getLastname());
        exitingCustomer.setAge(customer.getAge());
        exitingCustomer.setEmail(customer.getEmail());
        return customerRespository.save(exitingCustomer);
    }

    @Override
    public String deleteCustomer(long id) {
        customerRespository.deleteById(id);
        return "Delete " + id;
    }

    @Override
    public Customer getCustomerById(long id) {
        Optional<Customer> optional = customerRespository.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        }else {
            throw new RuntimeException("Employe not found for id: " + id);
        }
        return customer;
    }

}



