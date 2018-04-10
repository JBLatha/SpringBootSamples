package com.autorestart.example.autorestartdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

	   @RequestMapping("/test")
	    public String handle(Model model) {
	        model.addAttribute("msg", "a message from controller");
	        return "index21";
	    }

	    @RequestMapping("/test2")
	    public String handle2(Model model) {
	        model.addAttribute("msg2", "a message from controller 2");
	        return "testView2";
	    }
}
