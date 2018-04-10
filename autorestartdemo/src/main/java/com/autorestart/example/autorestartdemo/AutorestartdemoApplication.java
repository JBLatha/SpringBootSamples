package com.autorestart.example.autorestartdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutorestartdemoApplication {

	public static void main(String[] args) {
		System.out.println("hello -1fd ffjj");
		//System.setProperty("spring.devtools.restart.enabled", "false"); 
		SpringApplication.run(AutorestartdemoApplication.class, args);
	}
}
