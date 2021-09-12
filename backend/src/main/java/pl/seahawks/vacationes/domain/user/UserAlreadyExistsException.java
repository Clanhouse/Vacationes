package pl.seahawks.vacationes.domain.user;

import lombok.Getter;

@Getter
public class UserAlreadyExistsException extends Exception {

    public UserAlreadyExistsException(String email) {
        super("Username with email: " + email + " already exists");
    }
}
