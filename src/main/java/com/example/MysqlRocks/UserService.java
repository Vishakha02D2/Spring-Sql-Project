package com.example.MysqlRocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String createUser(User user) {
        userRepository.save(user);

        return "User added successfully";
    }

    public User getUser(int id) {
        User user = userRepository.findById(id).get();//Help you find the Entity by Pk
        return user;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}