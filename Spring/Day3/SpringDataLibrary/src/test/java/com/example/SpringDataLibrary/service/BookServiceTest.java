package com.example.SpringDataLibrary.service;

import com.example.SpringDataLibrary.dao.BookRepository;
import com.example.SpringDataLibrary.dto.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookServiceTest {

    @MockBean
    BookRepository mockRepo;

    @Autowired
    BookService bookService;

    @Test
    public void serviceReturnsNewList(){
        //arrange
        when(mockRepo.findAll()).thenReturn(new ArrayList<Book>());

        //act
        List<Book> books = bookService.getAllBooks();

        //assert
        verify(mockRepo, times(1)).findAll();
        assertEquals(1, books.size());
    }

    @Test
    public void serviceReturnsListofBooks(){
        Book b1 = new Book();
        Book b2 = new Book();
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        //arrange
        when(mockRepo.findAll()).thenReturn(books);

        //act
        List<Book> booksReturn = bookService.getAllBooks();

        //assert
        verify(mockRepo, times(1)).findAll();
        assertEquals(2, booksReturn.size());
    }
}
