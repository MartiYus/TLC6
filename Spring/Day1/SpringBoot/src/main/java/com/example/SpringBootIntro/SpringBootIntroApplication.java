package com.example.SpringBootIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroApplication implements CommandLineRunner {

	@Autowired
	Owner owner;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		owner.makePetTalk();
	}
}
