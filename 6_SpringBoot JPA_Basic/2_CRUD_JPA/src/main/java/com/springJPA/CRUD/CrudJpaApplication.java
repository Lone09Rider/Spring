package com.springJPA.CRUD;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springJPA.CRUD.dao.UserRepo;
import com.springJPA.CRUD.entities.User;

@SpringBootApplication
public class CrudJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudJpaApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);

////		1. Adding Users i.e Create and Read
		
//		User user = new User();
//		user.setName("Lucky");
//		user.setCity("Chennai");
//		
//		userRepo.save(user);
//		System.out.println(user);
//
//		User user0 = new User();
//		user0.setName("Raju");
//		user0.setCity("Bareily");
//
//		User user1 = new User();
//		user1.setName("Ankit");
//		user1.setCity("Mumbai");
//
//		User user2 = new User();
//		user2.setName("Akshay");
//		user2.setCity("Pithoragarh");
//
////		Saving Single User
//		
//		userRepo.save(user0);
//		System.out.println(user0);
//
//		userRepo.save(user1);
//		System.out.println(user1);
//
//		userRepo.save(user2);
//		System.out.println(user2);
//		
////		 For Multiple Save at once 
//		
//		User user3 = new User();
//		user3.setName("Vinay");
//		user3.setCity("Pune");
//
//		User user4 = new User();
//		user4.setName("Ayank");
//		user4.setCity("Banaras");
//		
//		List<User> users = List.of(user3, user4);
//		userRepo.saveAll(users);
//		System.out.println(user3);
//		System.out.println(user4);
		
////		2. Update User
		Optional<User> optional = userRepo.findById(3);
		User user = optional.get();
		
		user.setCity("Pune");
		userRepo.save(user);
		
		System.out.println(user);
		
////		3. Delete Data
		Optional<User> optional2 = userRepo.findById(5);
		User user2 = optional2.get();
		userRepo.delete(user2);
		System.out.println(user2);
		
	}

}
