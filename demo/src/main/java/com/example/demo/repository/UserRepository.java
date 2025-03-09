package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); // Existing functionality remains

    @Query("""
        SELECT DISTINCT u FROM User u
        LEFT JOIN u.userInterests ui
        LEFT JOIN u.userSchools us
        WHERE u.hometown.id = :hometownId
           OR ui.interest.intrestId IN (
                SELECT ui2.interest.intrestId FROM UserInterest ui2 WHERE ui2.user.userId = :userId
           )
           OR us.school.school_id IN (
                SELECT us2.school.school_id FROM UserSchool us2 WHERE us2.user.userId = :userId
           )
    """)
    List<User> findMatchingUsers(Long userId, Long hometownId);
}
