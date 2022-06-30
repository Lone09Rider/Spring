package com.springJPA.Custom_Finder_Methods;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User, Integer> {
	
	public List<User> findByName(String name);
	
}
