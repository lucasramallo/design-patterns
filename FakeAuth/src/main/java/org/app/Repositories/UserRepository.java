package org.app.Repositories;

import org.app.DB.DB;
import org.app.domain.user.User;

public class UserRepository {
    private DB db;

    public UserRepository() {}

    public void save(User user) {
        DB.getInstance().saveUser(user);
    }
}
