package org.app.controller;

import org.app.Services.UserService;
import org.app.domain.user.User;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User createUser(String name, String cpf, String email, String password) {
        User user = this.userService.createUser(name, cpf, email, password);
        return user;
    }
}
