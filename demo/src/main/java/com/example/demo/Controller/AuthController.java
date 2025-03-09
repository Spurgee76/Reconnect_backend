package com.example.demo.Controller;

import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class AuthController {
    private final UserService userService;
    private final AuthenticationManager authenticationManager;

    public AuthController(UserService userService, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }
}

//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody User use) {
//        userService.saveUser(use);
//        return ResponseEntity.ok("User registered successfully!");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody User use) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(use.getEmail(), use.getPassword())
//        );
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return ResponseEntity.ok("Login successful!");
//    }
//}
