import { Component, Input, OnInit } from '@angular/core';
import { Book } from '../models/Book';
import { Category } from '../models/Category';
import { ActivatedRoute } from '@angular/router';
import { BookService } from '../services/book.service';

@Component({
  selector: 'book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent{

  isbn!: string;
  listOfBooks:Book[] =[];
  myBook?: Book;

  constructor(private route:ActivatedRoute, private bookService: BookService){
    this.route.params.subscribe(params => this.getBook(params) );
  }

  getBook(params:any){
    if (Object.keys(params).length === 0 ){
      this.myBook = new Book("","","","",new Date(),"","yes", new Category(0,""));
    }
    else {
      this.bookService.getBookByIsbn(params.isbn).subscribe(value => this.myBook = value )
  }
  }


}
