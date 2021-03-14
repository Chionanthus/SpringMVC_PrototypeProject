package com.chionanthus.controller;

import com.chionanthus.pojo.Books;
import com.chionanthus.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model)
    {
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/toAddPaper")
    public String toAddPaper()
    {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books)
    {
        System.out.println("addBook==>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model)
    {
        Books books = bookService.queryBook(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books)
    {
        System.out.println("updateBook==>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id)
    {bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model)
    {
        List<Books> list = bookService.queryBookByName(queryBookName);
        model.addAttribute("list",list);
        return "allBook";
    }
}
