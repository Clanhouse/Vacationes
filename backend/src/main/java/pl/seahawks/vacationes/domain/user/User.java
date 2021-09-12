package pl.seahawks.vacationes.domain.user;

import lombok.*;
import pl.seahawks.vacationes.domain.user.role.Role;
import pl.seahawks.vacationes.domain.user.role.UserRole;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "users")
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String password;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER,
            cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH},
            orphanRemoval = true)
    private Set<UserRole> userRoles;
    private boolean mailAuthenticated;
    private boolean newsletterSigned;

    public void addUserRole(UserRole userRole) {
        userRoles.add(userRole);
    }

    public void removeUserRole(Role role) {
        userRoles.removeIf(userRole -> userRole.getRole().equals(role));
    }
}
