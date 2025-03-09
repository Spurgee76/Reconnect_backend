package com.example.demo.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserSchoolId implements Serializable {
    private Long userId;
    private Long schoolId;

    public UserSchoolId() {}

    public UserSchoolId(Long userId, Long schoolId) {
        this.userId = userId;
        this.schoolId = schoolId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSchoolId that = (UserSchoolId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(schoolId, that.schoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, schoolId);
    }
}
