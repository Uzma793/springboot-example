package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	
	}
	
	public void get() {
		System.out.println("get");
	}
	public void getall() {

		System.out.println("getall");
		}
	
	
}
