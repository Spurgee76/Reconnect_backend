package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.FriendMatchingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class FriendMatchingController {
    private final FriendMatchingService friendMatchingService;

    public FriendMatchingController(FriendMatchingService friendMatchingService) {
        this.friendMatchingService = friendMatchingService;
    }

    @GetMapping("/{userId}")
    public List<User> getMatchingFriends(@PathVariable Long userId) {
        return friendMatchingService.findMatchingFriends(userId);
    }
}
