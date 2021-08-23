package pl.seahawks.vacationes.converter;

import org.springframework.stereotype.Component;
import pl.seahawks.vacationes.request.RegisterRequest;
import pl.seahawks.vacationes.user.model.User;


@Component
public class UserConverter {

    public User from(RegisterRequest registerRequest) {
        return User.builder()
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .build();
    }
}
