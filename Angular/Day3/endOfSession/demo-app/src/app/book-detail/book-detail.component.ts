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
export class BookDetailComponent implements OnInit{

  isbn!: string;
  listOfBooks:Book[] =[];
  myBook?: Book;

  constructor(private route:ActivatedRoute, private bookService: BookService){
    this.route.params.subscribe(params => this.isbn = params['isbn'] );
  }

  ngOnInit(): void {
    this.myBook = this.bookService.getBookByIsbn(this.isbn);
  }

  title: string = "Book-Detail Component"

  counter: number = 0;
  
  // @Input()
   
  //= new Book("Scala", "32432432", "M.Odersky", "Have fun with Scala", new Date(), "OReilly", "yes", new Category(1, "Romance"));
  //myBook: Book = new Book("Not Scala", "32432432", "M.Odersky", "DO NOT Have fun with Scala", new Date(), "OReilly", "no", new Category(1, "Romance"));
  
  clickHandler(){
    console.log("I was clicked!")
    this.counter++;
  }


}
