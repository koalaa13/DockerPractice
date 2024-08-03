package com.example.hw2.controller;

import com.example.hw2.bean.UserMapper;
import com.example.hw2.model.User;
import com.example.hw2.model.dto.UserDto;
import com.example.hw2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"OK\"}";
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @PostMapping("/user")
    public String postUser(@RequestBody User user) {
        userRepository.save(user);
        return "Successfully added user";
    }

    @DeleteMapping("/user/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {
        if (!userRepository.existsById(userId)) {
            return "No such user";
        }
        userRepository.deleteById(userId);
        return String.format("Successfully delete user with id %d", userId);
    }

    @PutMapping("/user/{userId}")
    public String putUser(@PathVariable("userId") Long userId, @RequestBody UserDto userDto) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return "No such user";
        }
        userMapper.updateUserFromDto(userDto, user);
        userRepository.save(user);
        return String.format("Successfully updated user with id %d", userId);
    }
}
