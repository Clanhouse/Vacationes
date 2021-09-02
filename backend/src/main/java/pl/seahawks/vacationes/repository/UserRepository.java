package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.user.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailIgnoreCase(String email);

}
