package com.chionanthus.service;

import com.chionanthus.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books queryBook(int id);

    List<Books> queryAllBooks();

    List<Books> queryBookByName(@Param("bookName")String bookName);
}
