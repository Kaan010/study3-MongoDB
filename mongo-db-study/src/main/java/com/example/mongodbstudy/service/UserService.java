package com.example.mongodbstudy.service;

import com.example.mongodbstudy.dao.UserDao;
import com.example.mongodbstudy.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserService {

    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(String id) {
        return userDao.findById(id).orElse(null);
    }

    public User save(User user) {
        return userDao.save(user);
    }

    public void delete(String userId) {
        userDao.deleteById(userId);
    }
}
