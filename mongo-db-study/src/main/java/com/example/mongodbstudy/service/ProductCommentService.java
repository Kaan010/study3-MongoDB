package com.example.mongodbstudy.service;

import com.example.mongodbstudy.dao.ProductCommentDao;
import com.example.mongodbstudy.model.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
}
