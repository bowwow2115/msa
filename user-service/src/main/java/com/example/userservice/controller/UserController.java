package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    private Environment env;
    private Greeting greeting;

    public UserController(Environment env, Greeting greeting) {
        this.env = env;
        this.greeting = greeting;
    }

    @GetMapping("/health_check")
    public String status() {
        return "I'm okay";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMewssage();
    }
}
