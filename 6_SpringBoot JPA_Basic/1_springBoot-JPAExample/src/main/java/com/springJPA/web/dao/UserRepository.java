package com.springJPA.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springJPA.web.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
