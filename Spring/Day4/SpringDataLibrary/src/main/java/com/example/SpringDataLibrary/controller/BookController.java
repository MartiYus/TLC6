package com.example.SpringDataLibrary.controller;
import com.example.SpringDataLibrary.dto.Book;
import com.example.SpringDataLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn);
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus saveNewBook(@RequestBody Book b){
        Book savedBook = bookService.saveBook(b);
        if (savedBook == null ){
            return HttpStatus.BAD_REQUEST;
        }
        else{
            return HttpStatus.CREATED;
        }
    }

}
