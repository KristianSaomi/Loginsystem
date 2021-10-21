package com.group8.userlogin.controller;

import com.group8.userlogin.service.CustomerService;
import com.group8.userlogin.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@ControllerAdvice
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
    public String save(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/home";
    }


    /*private static Logger logger = Logger.getLogger();

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String exception(final Throwable throwable, final Model model) {
        logger.error("Exception during execution of SpringSecurity application", throwable);
        String errorMessage = (throwable != null ? throwable.getMessage() : "Unknown error");
        model.addAttribute("errorMessage", errorMessage);
        return "error";*/

    public class MyErrorController implements ErrorController {

        @RequestMapping("/error")
        public String handleError() {
        return "error";
        }

    }
}



