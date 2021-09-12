package pl.seahawks.vacationes.domain.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.seahawks.vacationes.domain.user.User;

@RequestMapping("/api/login")
@RestController
public class LoginController {

    @PostMapping("/")
    public void login(@RequestBody User credentials) {
    }
}
