package pl.seahawks.vacationes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.seahawks.vacationes")
public class VacationesApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacationesApplication.class, args);
    }

}
