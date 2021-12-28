package com.example.mongodbstudy.dao;

import com.example.mongodbstudy.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<User, String> {
}
