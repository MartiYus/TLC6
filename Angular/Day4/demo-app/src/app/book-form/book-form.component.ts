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
  error?: string;

  constructor( private bookService: BookService, private router:Router){
    
  }

  ngOnInit(): void {
    this.bookService.getAllCategories().subscribe(value => this.categories = value);
  }

  book:Book = new Book("","","","",new Date(),"","yes", new Category(0,""))

  onSubmit(){
    this.book.pub_Date = new Date;
    this.book.availability = 'yes';
    this.bookService.saveBook(this.book).subscribe({
      next: value => {
        this.book = new Book("","","","",new Date(),"","yes", new Category(0,""));
        this.router.navigate(['books']);
      },
      error: error => this.error = error
    });
  }
}
