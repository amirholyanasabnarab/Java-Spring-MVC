package com.kahkeshan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
//    @GetMapping("/")
    @RequestMapping(method= RequestMethod.GET)
    public String Home(){
        return "index";
    }
}
