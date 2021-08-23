package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
