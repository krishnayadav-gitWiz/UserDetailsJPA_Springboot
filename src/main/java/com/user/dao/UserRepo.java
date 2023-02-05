package com.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.user.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {
       public List<User> findByNameAndCity(String name, String city);
       
       @Query(value = "select * from user", nativeQuery = true)
       public List<User> getUsers();
}
