import { Category } from "./Category";

export class Book{
    title: string;
    isbn: string;
    author : string;
    description: string;
    pub_Date : Date;
    publisher: string;
    availability: string;
    category: Category;

    constructor(title: string, isbn: string, author: string, description: string, pub_date: Date, publisher: string, avail: string, category:Category){
        this.author = author;
        this.availability = avail;
        this.description = description;
        this.pub_Date = pub_date;
        this.publisher = publisher;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
    }
}