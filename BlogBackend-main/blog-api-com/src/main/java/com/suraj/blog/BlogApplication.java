package com.suraj.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		System.out.println("Stash Change 1");
		SpringApplication.run(BlogApplication.class, args);
	}

	System.out.println("Stash Change 2");
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
