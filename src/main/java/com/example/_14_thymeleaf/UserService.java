package com.example._14_thymeleaf;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getUser(UserForm userForm) {
        try {
            User user = new User(userForm.getName(), userForm.getPassword());
            users.add(user);
            return users;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
