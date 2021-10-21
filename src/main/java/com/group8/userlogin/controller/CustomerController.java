package com.group8.userlogin.controller;

import com.group8.userlogin.service.CustomerService;
import com.group8.userlogin.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    //CRUD
    @Autowired
    private CustomerService customerService;


    @RequestMapping("/home")
    public String getAllCustomer(Model model) {
        model.addAttribute("getAllCustomer", customerService.getAllCustomerList());
        return "home";
    }


    @RequestMapping("/saveform")
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

    public class MyErrorController implements ErrorController {
    /*
        @RequestMapping("/error")
        public String handleError() {
            return "error";
        }

     */
    }



}
