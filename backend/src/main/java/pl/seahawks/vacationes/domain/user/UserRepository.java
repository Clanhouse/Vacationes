package pl.seahawks.vacationes.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailIgnoreCase(String email);

}
