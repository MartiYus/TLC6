package com.example.SpringDataLibrary.service;

import com.example.SpringDataLibrary.dao.BookRepository;
import com.example.SpringDataLibrary.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBookByTitleStartingWithLetter(String letter){
        if (letter != null){
            letter = letter + "%";
            List<Book> books = bookRepository.findByTitleStartingWithLetter(letter);
            return books;
        }
        return new ArrayList<>();
    }

    public List<Book> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        if (books.size() == 0){
            Book b = new Book();
            books.add(b);
        }
        return books;
    }

    public Book saveBook(Book newBook){
        return bookRepository.save(newBook);
    }

    public Book getBookByIsbn(String isbn){
        Optional<Book> b = bookRepository.findById(isbn);
        if(b.isPresent()){
            return b.get();
        }
        else return new Book();
    }


}
