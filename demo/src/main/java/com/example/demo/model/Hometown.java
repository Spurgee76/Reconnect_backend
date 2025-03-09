package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Hometown_table")
public class Hometown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hometown_id")
    private Long id;

    @Column(name = "town_name")
    private String townName;

    @Column(name = "estate")
    private String estate;

    // Constructors
    public Hometown() {}

    public Hometown(String townName, String estate) {
        this.townName = townName;
        this.estate = estate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTownName() { return townName; }
    public void setTownName(String townName) { this.townName = townName; }

    public String getEstate() { return estate; }
    public void setEstate(String estate) { this.estate = estate; }
}
