package pl.seahawks.vacationes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.seahawks.vacationes.security.LoginCredentials;


@RequestMapping("/api/login")
@RestController
public class LoginController {


    @PostMapping("/login")
    public void login(@RequestBody LoginCredentials credentials) {}

}
