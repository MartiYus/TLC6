package com.example.SpringDataLibrary;

import com.example.SpringDataLibrary.dao.BookRepository;
import com.example.SpringDataLibrary.dto.Book;
import com.example.SpringDataLibrary.dto.Category;
import com.example.SpringDataLibrary.service.BookService;
import com.example.SpringDataLibrary.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataLibraryApplication {

//	@Autowired
//	BookService bookService;

//	@Autowired
//	CategoryService categoryService;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataLibraryApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {

//		List<Book> books = bookRepo.findAll();
//		for (Book b : books){
//			System.out.println(b);
//		}
//		List<Book> books = bookRepo.findByTitle("Outlander");
//		for (Book b : books){
//			System.out.println(b);
//		}
//		System.out.println(b.get());

//		List<Book> books = bookService.getBookByTitleStartingWithLetter("S");
//		for (Book b : books){
//			System.out.println(b);
//		}

//		Category category = categoryService.getCategoryById(5);
//		System.out.println(category);


//	}
}
