package com.wipro;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment1Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("****************** Available beans ****************************");
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName:beanNames) {
			System.out.println(beanName);
		}
		
	}

}
