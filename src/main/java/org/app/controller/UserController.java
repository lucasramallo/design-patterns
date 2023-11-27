package org.app.controller;

import org.app.Services.UserService;
import org.app.models.user.User;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User createUser(String name, String cpf, String email, String password) {
        User user = this.userService.createUser(name, cpf, email, password);
        return user;
    }
}
