package com.example.mongodbstudy.controller;

import com.example.mongodbstudy.model.ProductComment;
import com.example.mongodbstudy.model.User;
import com.example.mongodbstudy.service.ProductCommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<ProductComment> findById(@PathVariable String id) {
        return new ResponseEntity<>(
                productCommentService.findById(id),
                HttpStatus.OK
        );
    }

    @PostMapping("")
    public ResponseEntity<ProductComment> save(@RequestBody ProductComment productComment) {
        return new ResponseEntity<>(
                productCommentService.save(productComment),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("")
    public ResponseEntity<Void> delete(@PathVariable String productCommentId) {
        productCommentService.delete(productCommentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
