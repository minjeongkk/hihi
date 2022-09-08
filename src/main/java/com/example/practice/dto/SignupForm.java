package com.example.practice.dto;

import com.example.practice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class SignupForm {
    private Long id;
    private String userId;
    private String password;

    private String email;

    public static SignupForm createDto(User user) {
        return new SignupForm(user.getId(),
                user.getUserId(),
                user.getPassword(),
                user.getEmail());
    }

    public User toEntity() {return new User(id, userId, password, email);}
}