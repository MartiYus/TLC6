package com.example.SpringDataLibrary.dto;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Category( String name) {
        this.name = name;
    }

    public Category() {
    }

    //@OneToMany(mappedBy = "category", fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Book> books;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public void addBook(Book b){
        if (books == null) {
            books = new ArrayList<>();
        }
        books.add(b);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
