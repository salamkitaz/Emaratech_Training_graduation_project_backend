package com.example.angularshopbackend.controller;

import com.example.angularshopbackend.entities.Location;
import com.example.angularshopbackend.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;


    @GetMapping(value="/getLocations")
    public List<Location> getAllLocations(){
        return locationService.findAll();
    }

    @GetMapping(value="/getLocation/{id}")
    public Optional<Location> getLocation(@PathVariable("id") Long id){
        return locationService.findByID(id);
    }
//    @PostMapping(value= "/register")
//    public User registerUser(@RequestBody User newUser) {
//        try {
//            userService.save(newUser);
//        }catch (Exception exc){
//            return null;
//        }
//        return newUser;
//    }
//    @PostMapping("/login")
//    public User loginUser(@RequestBody User user) {
//        User userFound = userService.loadUserByEmail(user.getEmail());
//         if (userFound!=null && (user.getEmail().equals(userFound.getEmail()) && (user.getPassword().equals(userFound.getPassword())))) {
//
//                return userFound;
//            }
//
//        return null;
//    }
}
