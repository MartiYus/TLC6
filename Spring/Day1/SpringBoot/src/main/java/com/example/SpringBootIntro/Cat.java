package com.example.SpringBootIntro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    @Value("Tom")
    private String name;

    public Cat(){
    }

    public void makeCatSpeak(){
        System.out.println("Meow meow, my name is "+ name );
    }

    public void setName(String newName) {
        this.name = newName;
    }

}
