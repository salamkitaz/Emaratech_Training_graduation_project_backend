package com.example.angularshopbackend.services;

import com.example.angularshopbackend.entities.User;
import com.example.angularshopbackend.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void save(User user) {
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }

    public User loadUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
