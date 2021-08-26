package pl.seahawks.vacationes.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pl.seahawks.vacationes.user.model.User;

import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserEntityDetails implements UserDetails {

    private final User entity;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return entity.getUserRoles().stream()
                .map(userRole -> new SimpleGrantedAuthority(userRole
                        .getRole()
                        .name()))
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return entity.getPassword();
    }

    @Override
    public String getUsername() {
        return entity.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
