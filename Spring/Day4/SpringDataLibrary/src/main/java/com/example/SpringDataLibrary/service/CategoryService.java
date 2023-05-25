package com.example.SpringDataLibrary.service;

import com.example.SpringDataLibrary.dao.CategoryRepository;
import com.example.SpringDataLibrary.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategoryById(int id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
