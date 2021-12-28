package com.example.mongodbstudy.controller;

import com.example.mongodbstudy.model.User;
import com.example.mongodbstudy.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<>(
                userService.findAll(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        return new ResponseEntity<>(
                userService.findById(id),
                HttpStatus.OK
        );
    }

    @PostMapping("")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(
                userService.save(user),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("")
    public ResponseEntity<Void> delete(@PathVariable String userId) {
        userService.delete(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
