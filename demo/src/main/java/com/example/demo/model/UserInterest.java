package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User_Intrests")
public class UserInterest {

    @EmbeddedId
    private UserInterestId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("intrestId")
    @JoinColumn(name = "intrest_id", nullable = false)
    private Interest interest;

    public UserInterest() {}

    public UserInterest(User user, Interest interest) {
        this.id = new UserInterestId(user.getUserId(), interest.getIntrest_id());
        this.user = user;
        this.interest = interest;
    }

    public UserInterestId getId() {
        return id;
    }

    public void setId(UserInterestId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }
}
