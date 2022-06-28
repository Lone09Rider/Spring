package com.springJPA.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.entities.User;
import com.springJPA.dao.UserRepository;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setCity("Chennai");
		user.setName("Varish");
		user.setStatus("Working");
		
		User user1 = userRepo.save(user);
		
		System.out.println(user1);
		
	}

}
