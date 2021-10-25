package com.group8.userlogin.service;

import com.group8.userlogin.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomerList();

    void saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    public String deleteCustomer(long id);
}
