package com.telusko.SimpleWeb;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        return "Welcome to Spring-WEB!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is a Simple-Web application.";
    }
}
