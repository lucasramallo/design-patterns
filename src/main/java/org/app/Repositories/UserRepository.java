package org.app.Repositories;

import org.app.DB.DB;
import org.app.models.user.User;

public class UserRepository {
    private DB db;

    public UserRepository() {
        this.db = new DB();
    }

    public void save(User user) {
        this.db.saveUser(user);
    }
}
