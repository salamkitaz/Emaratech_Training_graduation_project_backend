package com.example.angularshopbackend.repos;

import com.example.angularshopbackend.entities.Location;
import com.example.angularshopbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(int id);
}
