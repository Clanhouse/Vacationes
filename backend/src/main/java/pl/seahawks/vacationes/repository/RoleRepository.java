package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.user.model.Role;
import pl.seahawks.vacationes.user.model.UserRole;

public interface RoleRepository extends JpaRepository <UserRole, Long> {
    UserRole findByRole(Role role);
}
