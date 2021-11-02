package pl.seahawks.vacationes.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.seahawks.vacationes.repository.UserRepository;
import pl.seahawks.vacationes.request.RegisterRequest;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public boolean isUserExists(RegisterRequest request) {
        return userRepository
                .findByEmail(request.getEmail())
                .isPresent();
    }
}
