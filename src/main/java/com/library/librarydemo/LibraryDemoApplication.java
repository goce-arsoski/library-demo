package com.library.librarydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryDemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(LibraryDemoApplication.class, args);
//	}
	public static void main(String[] args) {
		try {
			SpringApplication.run(LibraryDemoApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
