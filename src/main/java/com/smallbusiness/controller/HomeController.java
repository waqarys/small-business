package com.smallbusiness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smallbusiness.model.Customer;

@Controller
public class HomeController {

	private String pageHeading;
	private String subHeading;
	private String title;
	
	@RequestMapping("/")
	public String home(Model model){
		pageHeading = "Small Business";
		subHeading = "A Small Business Responsive Theme";
		model.addAttribute("pageHeading", pageHeading);
		model.addAttribute("subHeading", subHeading);
		model.addAttribute("title", "Home");
		return "home";
	}
	
	@RequestMapping("/login")
    public String login(
            @RequestParam(value="error", required = false)
            String error,
            @RequestParam(value="logout", required = false)
            String logout,
            Model model){

        if(error != null){
            model.addAttribute("error", "Invalid username and password");
        }

        if (logout !=null){
            model.addAttribute("msg", "You have been logged out successfully");
        }

        return "login";
    }
	
	@RequestMapping("/about")
	public String about(Model model){
		pageHeading = "About Us";
		subHeading = "This is what we do";
		model.addAttribute("pageHeading", pageHeading);
		model.addAttribute("subHeading", subHeading);
		model.addAttribute("title", "About");
		return "about";
	}
	
	@RequestMapping("/page")
	public String page(Model model){
		pageHeading = "Services";
		subHeading = "Trust our vision!";
		model.addAttribute("pageHeading", pageHeading);
		model.addAttribute("subHeading", subHeading);
		model.addAttribute("title", "Sample Page");
		return "page";
	}
	
	@RequestMapping("/contact")
	public String contact(Model model){
		pageHeading = "Contact Us";
		subHeading = "795 Design Ave, Suite 780, Mumbai, Maharashtra!";
		model.addAttribute("pageHeading", pageHeading);
		model.addAttribute("subHeading", subHeading);
		model.addAttribute("title", "CONTACT");
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "contact";
	}
}
