package com.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private List<String> roles;
}
