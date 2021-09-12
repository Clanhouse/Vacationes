package pl.seahawks.vacationes.domain.user.role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <UserRole, Long> {
    UserRole findByRole(Role role);
}
