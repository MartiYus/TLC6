import { Component, OnInit } from '@angular/core';
import { Book } from '../models/Book';

@Component({
  selector: 'books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit{

  books: Book[] = []

  ngOnInit(): void {
    this.books = [{"title":"Scala","isbn":"123456","author":"Martin Odersky","description":"Come and have fun with Scala","pub_Date":new Date("2018-01-01"),"cat":{"id":5,"name":"Non Fiction"},"publisher":"OReilly","availability":"yes"},
  {"title":"1984","isbn":"4327843","author":"George Orwell","description":"Scary book light years ahead of its time","pub_Date":new Date("2019-01-01"),"cat":{"id":3,"name":"Sci-fi"},"publisher":"Penguin","availability":"yes"},
  {"title":"Outlander","isbn":"3524635","author":"Diana Gabaldon","description":"Amazing story, romance through times","pub_Date": new Date("1991-10-06"),"cat":{"id":1,"name":"Romance"},"publisher":"Delacorte Books","availability":"no"},
  {"title":"The Witcher","isbn":"2333647","author":"Andrzej Sapkowski","description":"Follow a strange guy fighting creatures","pub_Date":new Date("1986-08-15"),"cat":{"id":4,"name":"Fantasy"},"publisher":"SuperNowa","availability":"yes"},
  {"title":"Christmas Carol","isbn":"436483","author":"Charles Dickens","description":"Story of Ebenezer Scrooge","pub_Date":new Date("2022-11-30"),"cat":{"id":6,"name":"History"},"publisher":"Black Swan","availability":"yes"}]

  }

  
}
