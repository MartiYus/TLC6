package com.example.SpringDataLibrary.controller;
import com.example.SpringDataLibrary.dto.Book;
import com.example.SpringDataLibrary.dto.Category;
import com.example.SpringDataLibrary.service.BookService;
import com.example.SpringDataLibrary.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

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

    @GetMapping("/exchange")
    public String getExchangeData(){
        String uri = "https://exchange.matraining.com/pd";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping("/cats")
    public List<Category> getAllCats(){
        return categoryService.getAllCategories();
    }

}
