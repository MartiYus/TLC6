import { Component, OnInit } from '@angular/core';
import { Book } from '../models/Book';
import { Category } from '../models/Category';
import { BookService } from '../services/book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-form',
  templateUrl: './book-form.component.html',
  styleUrls: ['./book-form.component.css']
})
export class BookFormComponent implements OnInit{

  categories: Category[] = [];

  constructor( private bookService: BookService, private router:Router){
    
  }

  ngOnInit(): void {
    this.categories = this.bookService.getAllCategories();
  }

  book:Book = new Book("","","","",new Date(),"","yes", new Category(0,""))

  onSubmit(){
      this.bookService.saveBook(this.book);
      this.book = new Book("","","","",new Date(),"","yes", new Category(0,""));
      this.router.navigate(["books"]);

  }
}
