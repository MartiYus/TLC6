package com.example.SpringBootIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    //dependency
    private Cat cat;
    private String name;

    //constructor injection
    @Autowired
    public Owner(Cat cat){
        this.cat = cat;
    }

    //setter injection
    public void setCat(Cat cat){
        this.cat = cat;
    }

    public void makePetTalk(){
        cat.makeCatSpeak();
    }

    public void renameCat(String newName){
        cat.setName(newName);
    }
}
