package pl.seahawks.vacationes.exception;

import lombok.Getter;

@Getter
public class UserAlreadyExistsException extends Exception{
    private String email;

    public UserAlreadyExistsException(String email) {
        super("Username with email: " + email + " already exists");
        this.email = email;
    }
}
