package com.example.angularshopbackend.services;

import com.example.angularshopbackend.entities.Role;
import com.example.angularshopbackend.repos.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public Role findRoleById(int id) {
        return roleRepository.findById(id);
    }
}
