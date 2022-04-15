package com.example.angularshopbackend.services;

import com.example.angularshopbackend.entities.Location;
import com.example.angularshopbackend.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;


    public void save(Location location) {
        locationRepository.save(location);
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Optional<Location> findByID(Long id){
        return locationRepository.findById(id);
    }
}
