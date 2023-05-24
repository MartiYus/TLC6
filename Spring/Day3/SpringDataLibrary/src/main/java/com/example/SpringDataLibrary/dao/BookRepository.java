package com.example.SpringDataLibrary.dao;

import com.example.SpringDataLibrary.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    public List<Book> findByTitle(String title);

    @Query(nativeQuery = true, value="select * from book where title like :letter")
    public List<Book> findByTitleStartingWithLetter(String letter);
}
