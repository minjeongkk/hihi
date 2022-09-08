package com.example.practice.service;

import com.example.practice.dto.SignupForm;
import com.example.practice.entity.User;
import com.example.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public SignupForm create(SignupForm dto) {
        User user = User.create(dto);

        User created = userRepository.save(user);

        return SignupForm.createDto(created);
    }
}