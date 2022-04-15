package com.example.angularshopbackend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String Name;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
