package com.example.demo.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserInterestId implements Serializable {
    private Long userId;
    private Long intrestId;

    public UserInterestId() {}

    public UserInterestId(Long userId, Long interestId) {
        this.userId = userId;
        this.intrestId = interestId;
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getInterestId() { return intrestId; }
    public void setInterestId(Long interestId) { this.intrestId = interestId; }

    // Override equals and hashCode for proper entity comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInterestId that = (UserInterestId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(intrestId, that.intrestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, intrestId);
    }
}
