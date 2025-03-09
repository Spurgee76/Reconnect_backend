package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FriendMatchingService {
    private final UserRepository userRepository;

    public FriendMatchingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findMatchingFriends(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        User user = userOptional.get();

        List<User> matchingFriends = userRepository.findMatchingUsers(
                user.getUserId(), user.getHometown().getId()
        );

        return matchingFriends.stream()
                .filter(u -> !u.getUserId().equals(userId)) // Exclude current user
                .collect(Collectors.toList());
    }
}
