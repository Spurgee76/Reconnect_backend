package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Intrests_table")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intrest_id")  // Explicit column mapping
    private Long intrestId;

    @Column(name = "intrest_name") // Explicit column mapping
    private String intrestName;

    // Constructors
    public Interest() {}

    public Interest(String intrestName) {
        this.intrestName = intrestName;
    }

    // Getters and Setters
    public Long getIntrest_id() { return intrestId; }
    public void setIntrestId(Long intrestId) { this.intrestId = intrestId; }

    public String getIntrestName() { return intrestName; }
    public void setIntrestName(String intrestName) { this.intrestName = intrestName; }


}
