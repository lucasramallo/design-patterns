package org.app;

import org.app.controller.UserController;
import org.app.models.auth.Auth;
import org.app.models.user.User;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        User user = userController.createUser("Lucas", "13316693498", "lucas@gmail.com", "123");
        System.out.println(user.toString());
    }
}