package org.app.Repositories;

import org.app.DB.DB;
import org.app.domain.user.User;

public class UserRepository {
    public void save(User user) {
        DB.getInstance().saveUser(user);
    }

    public void getUsers() {
        DB.getInstance().getUserArray().stream().forEach(user -> System.out.println(user.toString()));
    }
}
