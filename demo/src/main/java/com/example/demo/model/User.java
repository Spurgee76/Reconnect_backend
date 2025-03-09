package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "`Users_table`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // Ensure correct column mapping
    private Long userId;

    private String name;
    private int age;
    private String email;
    private String password;

    @Column(name = "childhood_hometown")
    private String childhoodHometown;

    private String gender;

    @Column(name = "profile_picture_url")
    private String profilePictureUrl;

    @ManyToOne
    @JoinColumn(name = "hometown_id") // Foreign key column
    private Hometown hometown;

    // Constructors
    public User() {}

    public User(String name, int age, String email, String password, String childhoodHometown, String gender, String profilePictureUrl, Hometown hometown) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.childhoodHometown = childhoodHometown;
        this.gender = gender;
        this.profilePictureUrl = profilePictureUrl;
        this.hometown = hometown;
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getChildhoodHometown() { return childhoodHometown; }
    public void setChildhoodHometown(String childhoodHometown) { this.childhoodHometown = childhoodHometown; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getProfilePictureUrl() { return profilePictureUrl; }
    public void setProfilePictureUrl(String profilePictureUrl) { this.profilePictureUrl = profilePictureUrl; }

    public Hometown getHometown() { return hometown; }
    public void setHometown(Hometown hometown) { this.hometown = hometown; }
}
