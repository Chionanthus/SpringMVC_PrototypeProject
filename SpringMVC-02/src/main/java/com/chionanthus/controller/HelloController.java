package com.chionanthus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {
    @RequestMapping("/test")
    public String hello(Model model)
    {
        model.addAttribute("msg","Hello,SpringMVCAnnotation");
        return "result";
    }
    @RequestMapping("/test2")
    public String test1(String name,Model model)
    {
        model.addAttribute("msg",name);
        return "result";
    }


}
