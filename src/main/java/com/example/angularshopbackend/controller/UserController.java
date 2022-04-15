package com.example.angularshopbackend.controller;

import com.example.angularshopbackend.entities.Role;
import com.example.angularshopbackend.entities.User;
import com.example.angularshopbackend.services.RoleService;
import com.example.angularshopbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;
    @PostMapping(value= "/register")
    public User registerUser(@RequestBody User newUser) {

        newUser.setRole(roleService.findRoleById(1));
        try {
            userService.save(newUser);
        }catch (Exception exc){
            return null;
        }
        return newUser;
    }
    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        User userFound = userService.loadUserByEmail(user.getEmail());
         if (userFound!=null && (user.getEmail().equals(userFound.getEmail()) && (user.getPassword().equals(userFound.getPassword())))) {

                return userFound;
            }

        return null;
    }
}
