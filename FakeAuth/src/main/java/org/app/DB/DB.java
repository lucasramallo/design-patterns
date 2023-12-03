package org.app.DB;

import org.app.domain.user.User;
import java.util.ArrayList;

public class DB {
    private ArrayList userArray;
    private static DB instance;

    private DB() {
        this.userArray = new ArrayList<User>();
    }

    public void saveUser(User user) {
        userArray.add(user);
    }

    public static DB getInstance() {
        if(instance == null) {
            instance = new DB();
        }

        return instance;
    }

    public ArrayList getUserArray() {
        return userArray;
    }
}
