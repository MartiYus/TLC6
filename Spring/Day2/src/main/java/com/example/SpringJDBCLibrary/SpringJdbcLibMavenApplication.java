package com.example.SpringJDBCLibrary;

import com.example.SpringJDBCLibrary.dao.BookDao;
import com.example.SpringJDBCLibrary.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJdbcLibMavenApplication implements CommandLineRunner {

	@Autowired
	BookDao bookDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcLibMavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Book> books = bookDao.getAllBooks();
		for (Book b : books){
			System.out.println(b);
		}
	}
}
