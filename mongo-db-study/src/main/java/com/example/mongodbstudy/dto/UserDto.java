package com.example.mongodbstudy.dto;

import com.example.mongodbstudy.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDto extends MongoRepository<User, String> {
}
