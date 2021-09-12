package pl.seahawks.vacationes.domain.user;

import org.springframework.stereotype.Component;
import pl.seahawks.vacationes.request.RegisterRequest;
import pl.seahawks.vacationes.domain.user.User;


@Component
public class UserConverter {

    public User from(RegisterRequest registerRequest) {
        return User.builder()
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .build();
    }
}
