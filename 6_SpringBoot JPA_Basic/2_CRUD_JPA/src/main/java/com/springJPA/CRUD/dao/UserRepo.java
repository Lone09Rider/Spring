package com.springJPA.CRUD.dao;

import org.springframework.data.repository.CrudRepository;

import com.springJPA.CRUD.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
