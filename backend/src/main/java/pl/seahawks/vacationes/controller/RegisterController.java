package pl.seahawks.vacationes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.seahawks.vacationes.request.RegisterRequest;
import pl.seahawks.vacationes.response.RegisterResponse;
import pl.seahawks.vacationes.service.RegistrationService;


@Controller
@RestController
@RequestMapping("/api/register")
@Slf4j
@RequiredArgsConstructor
public class RegisterController {

    private final RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<RegisterResponse> regUser(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok()
                .body(registrationService.registerNewUser(request));
    }


}
