package org.app;

import org.app.Repositories.UserRepository;
import org.app.Services.UserService;
import org.app.controller.UserController;
import org.app.domain.user.User;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);
        User user = userController.createUser(
                "Lucas",
                "13316693498",
                "lucas@gmail.com",
                "123"
        );
        System.out.println(user.toString());
    }
}