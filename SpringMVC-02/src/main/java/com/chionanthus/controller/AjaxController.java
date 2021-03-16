package com.chionanthus.controller;

import com.chionanthus.pojo.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/Ajaxtest")
    public List<Books> test()
    {
        List<Books> books = new ArrayList<>();
        books.add(new Books(1,"沉默的大多数",10,"王小波"));
        books.add(new Books(2,"黄金时代",10,"王小波"));
        books.add(new Books(3,"电锯人",10,"藤本树"));
        return books;
    }
}
