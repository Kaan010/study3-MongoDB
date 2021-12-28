package com.example.mongodbstudy.controller;

import com.example.mongodbstudy.model.ProductComment;
import com.example.mongodbstudy.model.User;
import com.example.mongodbstudy.service.ProductCommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prodcomment/")
public class ProductCommentController {

    private final ProductCommentService productCommentService;

    public ProductCommentController(ProductCommentService productCommentService) {
        this.productCommentService = productCommentService;
    }

    @GetMapping("")
    public ResponseEntity<List<ProductComment>> findAll() {
        return new ResponseEntity<>(
                productCommentService.findAll(),
                HttpStatus.OK
        );
    }


}
