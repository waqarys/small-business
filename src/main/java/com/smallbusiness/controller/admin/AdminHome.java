package com.smallbusiness.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smallbusiness.model.Customer;
import com.smallbusiness.service.CustomerService;

@Controller
public class AdminHome {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/admin/customer")
    public String customerManagerment(Model model){

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);

        return "customerManagement";
    }


} // The End of Class;
