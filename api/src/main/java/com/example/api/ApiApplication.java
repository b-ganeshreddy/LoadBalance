package com.example.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log4j2
public class ApiApplication {

    @GetMapping("/")
    public String hi() {
        log.info("accessed");
        return "Hi, Ganesh!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
