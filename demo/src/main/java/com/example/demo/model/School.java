package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "School_table")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private Long school_id;

    @Column(name = "school_name", nullable = false)
    private String school_name;

    @Column(name = "location", nullable = false)
    private String location;

    // Constructors
    public School() {}

    public School(String school_name, String location) {
        this.school_name = school_name;
        this.location = location;
    }

    // Getters and Setters
    public Long getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Long school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
