package dev.nights.UserRegister.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class UserController {
    @GetMapping("/welcomeUser")
    public String welcome(){
        return "Hello, user!";
    }
}
