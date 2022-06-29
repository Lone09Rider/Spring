package com.springJPA.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springJPA.web.dao.UserRepository;
import com.springJPA.web.entities.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Tomy Singh");
		user.setCity("Delhi");
		user.setStatus("Open For Job");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
		
//		Check MySQL DB for confirmation
		
	}

}
