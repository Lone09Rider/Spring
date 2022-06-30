package com.springJPA.Custom_Finder_Methods;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		User user = new User();
//		user.setName("Vinay");
//		user.setCity("Jaisalmer");
//		
//		User user1 = userRepo.save(user);
//		System.out.println(user1);
		
//		Optional<User> u1 = userRepo.findById(1);
//		System.out.println(u1);
		
		List<User> users = userRepo.findByName("Vinay");
		
		users.forEach(e->System.out.println(e));
		
	}

}
