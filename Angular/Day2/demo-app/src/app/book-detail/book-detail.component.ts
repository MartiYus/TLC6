import { Component, Input } from '@angular/core';
import { Book } from '../models/Book';
import { Category } from '../models/Category';

@Component({
  selector: 'book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent {

  title: string = "Book-Detail Component"

  counter: number = 0;
  
  @Input()
  myBook!: Book;
  //= new Book("Scala", "32432432", "M.Odersky", "Have fun with Scala", new Date(), "OReilly", "yes", new Category(1, "Romance"));
  //myBook: Book = new Book("Not Scala", "32432432", "M.Odersky", "DO NOT Have fun with Scala", new Date(), "OReilly", "no", new Category(1, "Romance"));
  
  clickHandler(){
    console.log("I was clicked!")
    this.counter++;
  }


}
