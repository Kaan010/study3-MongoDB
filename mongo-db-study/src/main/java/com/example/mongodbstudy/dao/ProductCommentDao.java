package com.example.mongodbstudy.dao;

import com.example.mongodbstudy.model.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentDao extends MongoRepository<ProductComment,String> {
}
