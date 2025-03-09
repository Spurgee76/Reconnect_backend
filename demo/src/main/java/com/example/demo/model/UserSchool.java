package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User_Schools")
public class UserSchool {

    @EmbeddedId
    private UserSchoolId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Lowercase 'u' in 'user'

    @ManyToOne
    @MapsId("schoolId")
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @Column(name = "year_joined")
    private int yearJoined;

    @Column(name = "year_left")
    private int yearLeft;

    public UserSchool() {}

    public UserSchool(User user, School school, int yearJoined, int yearLeft) {
        this.id = new UserSchoolId(user.getUserId(), school.getSchool_id());
        this.user = user;
        this.school = school;
        this.yearJoined = yearJoined;
        this.yearLeft = yearLeft;
    }

    public UserSchoolId getId() {
        return id;
    }

    public void setId(UserSchoolId id) {
        this.id = id;
    }

    public User getUser() {  // Lowercase 'u' in 'user'
        return user;
    }

    public void setUser(User user) {  // Lowercase 'u' in 'user'
        this.user = user;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public int getYearLeft() {
        return yearLeft;
    }

    public void setYearLeft(int yearLeft) {
        this.yearLeft = yearLeft;
    }
}
