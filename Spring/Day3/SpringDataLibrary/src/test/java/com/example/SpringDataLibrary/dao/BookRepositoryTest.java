package com.example.SpringDataLibrary.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.PropertySource;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@PropertySource("test-app.properties")
public class BookRepositoryTest {

//    @Autowired
//    TestEntityManager entityManager;

    @Autowired
    BookRepository bookRepo;

    @Test
    public void findAllReturnsEmptyList(){
        Iterable books = bookRepo.findAll();
        assertThat(books).isEmpty();
    }
}
