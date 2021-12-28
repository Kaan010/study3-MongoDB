package com.example.mongodbstudy.service;

import com.example.mongodbstudy.dao.ProductCommentDao;
import com.example.mongodbstudy.model.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductCommentService {

    private ProductCommentDao productCommentDao;

    public List<ProductComment> findAll() {
        return productCommentDao.findAll();
    }

    public ProductComment findById(String id) {
        return productCommentDao.findById(id)
                .orElseGet(null);
    }

    public ProductComment save(ProductComment productComment) {
        return productCommentDao.save(productComment);
    }

    public void delete(String productCommentId) {
        productCommentDao.deleteById(productCommentId);
    }
}
