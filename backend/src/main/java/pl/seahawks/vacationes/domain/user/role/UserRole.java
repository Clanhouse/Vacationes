package pl.seahawks.vacationes.domain.user.role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.seahawks.vacationes.domain.user.User;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @ManyToOne
    private User user;

    public UserRole(Role role, User user) {
        this.role = role;
        this.user = user;
    }
}

