package org.app.domain.auth;

import org.app.domain.user.User;
import java.security.SecureRandom;

public class Auth {
    public boolean validate(User user, String email, String password) {
        String requiredEmail = user.getEmail();
        String requiredPassword = user.getPassword();

        return email.equals(requiredEmail) && password.equals(requiredPassword);
    }

    public String genereteToken() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[9];
        random.nextBytes(bytes);
        String token = bytes.toString();
        System.out.println(token);
        return token;
    }
}
