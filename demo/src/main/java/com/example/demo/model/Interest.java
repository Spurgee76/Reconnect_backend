package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Intrests_table")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intrest_id;

    private String intrest_name;

    // Constructors
    public Interest() {}

    // Getters and Setters
}
