package com.example.mongodbstudy.dto;

import com.example.mongodbstudy.model.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentDto extends MongoRepository<ProductComment,String> {
}
