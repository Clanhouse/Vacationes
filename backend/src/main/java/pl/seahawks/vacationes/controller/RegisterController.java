package pl.seahawks.vacationes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.seahawks.vacationes.request.RegisterRequest;
import pl.seahawks.vacationes.service.RegistrationService;

@Controller
@RestController
@RequestMapping("/register")
@Slf4j
@RequiredArgsConstructor
public class RegisterController {

    private final RegistrationService registrationService;

    @PostMapping
    public Long registerUser(@RequestBody RegisterRequest request) {
        return registrationService.registerNewUser(request);
    }


}
