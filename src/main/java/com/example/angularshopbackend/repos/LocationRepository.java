package com.example.angularshopbackend.repos;

import com.example.angularshopbackend.entities.Location;
import com.example.angularshopbackend.entities.Role;
import com.example.angularshopbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findFirstById(int id);

}
