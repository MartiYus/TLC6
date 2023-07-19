package com.example.SpringDataLibrary.controller;

import com.example.SpringDataLibrary.dto.Category;
import com.example.SpringDataLibrary.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/view")
    public String showView(){
        return "myFirstView";
    }

    @GetMapping("/categories")
    public ModelAndView showCategories(){
        List<Category> cats = categoryService.getAllCategories();
        ModelAndView mav = new ModelAndView("categories.html");
        mav.addObject("categories", cats);
        return mav;
    }

}
