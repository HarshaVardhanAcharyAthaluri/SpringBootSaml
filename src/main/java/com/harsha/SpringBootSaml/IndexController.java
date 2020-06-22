package com.harsha.SpringBootSaml;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	
    @RequestMapping("/")
    public String index(Model m) {
    	m.addAttribute("message", "Welcome to HarshaLabs!!!!");
        return "index";
    }
    
    
    
}