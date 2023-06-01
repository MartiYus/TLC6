import { Component, OnInit } from '@angular/core';
import { Book } from '../models/Book';
import { Router } from '@angular/router';
import { BookService } from '../services/book.service';

@Component({
  selector: 'books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit{

  constructor(private router:Router, private bookService:BookService){}

  dataSource: Book[] = []

  ngOnInit(): void {
    this.bookService.getAllBooks().subscribe(value => {
      this.dataSource = value;
    })
  }

  getBookDetail(row:any){
    this.router.navigate(["book-detail", row.isbn])
  }

  displayedColumns: string[] = ['ISBN', 'Title', 'Author', 'Description', 'Publisher'];
  

  
}
