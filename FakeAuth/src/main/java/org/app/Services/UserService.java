package org.app.Services;

import org.app.Repositories.UserRepository;
import org.app.models.user.User;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }
    public User createUser(String name, String cpf, String email, String password) {
        User user = new User(name, cpf, email, password);
        this.userRepository.save(user);
        return user;
    }
}
