package com.example.projectgroup1.service;

import com.example.projectgroup1.entity.User;
import com.example.projectgroup1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User>getUser(int id){
        return Optional.ofNullable(userRepository.findById(id));
    }
}
