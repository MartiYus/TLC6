package com.example.SpringDataLibrary.dto;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Book {
    private String title;

    @Id
    private String isbn;
    private String author;

    private String description;
    private Date pub_Date;
    private String publisher;
    private String availability;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Book( String isbn, String title, String author, String description, Category category,  Date pub_Date, String publisher, String availability) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.description = description;
        this.pub_Date = pub_Date;
        this.category = category;
        this.publisher = publisher;
        this.availability = availability;
    }

    public Book() {
    }



    public Date getPub_Date() {
        return pub_Date;
    }

    public void setPub_Date(Date pub_Date) {
        this.pub_Date = pub_Date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", pub_Date=" + pub_Date +
                //", category=" + category +
                ", publisher='" + publisher + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
