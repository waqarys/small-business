package com.smallbusiness.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smallbusiness.model.Customer;
import com.smallbusiness.service.CustomerService;

@Controller
public class ContactFormController {
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
	private MailSender mailSender;

	@RequestMapping("/register")
    public String registerCustomer(Model model){
        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }
	
	@RequestMapping(value="/register.html", method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model){
		
		if(result.hasErrors()){
            return "contact";
        }
		
		List<Customer> customerList = customerService.getAllCustomers();
		
		for (int i=0; i< customerList.size(); i++){
            if(customer.getEmail().equals(customerList.get(i).getEmail())){
                model.addAttribute("emailMsg", "Email already exists");

                return "contact";
            }

            if(customer.getName().equals(customerList.get(i).getName())){
                model.addAttribute("usernameMsg", "Username already exists");

                return "contact";
            }
        }
		customerService.addCustomer(customer);
		
		sendMail(customer);
		
		return "registerCustomerSuccess";
	}

	private void sendMail(Customer customer) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(customer.getEmail());
		message.setTo("waqar.shaikh.y@gmail.com");
		message.setSubject("New Contact");
		message.setText(customer.getMessage());
		
		mailSender.send(message);
	}
}
