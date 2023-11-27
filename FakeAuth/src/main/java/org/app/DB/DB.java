package org.app.DB;

import org.app.models.user.User;
import java.util.ArrayList;

public class DB {
    private static ArrayList userArray;

    public DB() {
        this.userArray = new ArrayList<User>();
    }

    public void saveUser(User user) {
        userArray.add(user);
    }
}
