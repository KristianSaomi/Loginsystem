package com.group8.userlogin.controller;

import com.group8.userlogin.model.Customer;
import com.group8.userlogin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    //CRUD
    @Autowired
    private CustomerService customerService;

    @GetMapping("/home")
    public String getAllCustomer(Model model) {
        model.addAttribute("getAllCustomer", customerService.getAllCustomerList());
        return "home";
    }

    @GetMapping("/saveform")
    public String saveform(Model model) {
        Customer customer = new Customer();
        model.addAttribute("saveCustomer", customer);
        return "newCustomer";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customer")Customer customer ){
        customerService.saveCustomer(customer);
        return "redirect:/home";
    }


}
