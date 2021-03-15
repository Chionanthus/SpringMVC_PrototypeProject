package com.chionanthus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @RequestMapping("/mvcnmsl")
    public String test()
    {
        return "mvcnmsl";
    }
}
