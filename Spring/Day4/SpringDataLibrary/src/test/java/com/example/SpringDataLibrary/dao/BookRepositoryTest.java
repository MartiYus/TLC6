package com.example.SpringDataLibrary.dao;

import com.example.SpringDataLibrary.dto.Book;
import com.example.SpringDataLibrary.dto.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@PropertySource("test-app.properties")
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    CategoryRepository catRepo;

    @Test
    public void findAllReturnsEmptyList(){
        Iterable books = bookRepo.findAll();
        assertThat(books).isEmpty();
    }

    @Test
    public void findAllReturnsSavedBooks(){
        Category cat = new Category("Sci-fi");
        catRepo.save(cat);
        Book b = new Book("12345243", "Book1", "Martina", "Amazing book", cat, new Date(), "publisher", "yes");
        bookRepo.save(b);

        List<Book> books = bookRepo.findAll();
        assertThat(books).isNotEmpty();
        assertEquals(books.size(), 1);
    }

    @Test
    public void findBookByTitle(){
        Category cat = new Category("Romance");
        catRepo.save(cat);
        Book b = new Book("12345324", "Book2", "Martina", "Amazing book", cat, new Date(), "publisher", "yes");
        bookRepo.save(b);

        List<Book> books = bookRepo.findByTitle("Book2");
        assertEquals(1,books.size());
        assertEquals("Book2", books.get(0).getTitle());
    }


}
