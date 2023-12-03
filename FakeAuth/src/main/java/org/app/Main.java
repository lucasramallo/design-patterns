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

        User user2 = userController.createUser(
                "Lucas Silva",
                "13716693498",
                "lucas2@gmail.com",
                "123"
        );


       userController.getUsers();

        User user3 = userController.createUser(
                "Julia Silva",
                "13710993498",
                "julia@gmail.com",
                "123"
        );

        userController.getUsers();
    }
}