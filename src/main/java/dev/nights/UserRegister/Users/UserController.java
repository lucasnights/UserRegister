package dev.nights.UserRegister.Users;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcomeUser")
    public String welcome(){
        return "Hello, user!";
    }

    //Register user
    @PostMapping("/register")
        public String userRegister(){
            return "User registered";
        }
    //Show users registered
    @GetMapping("/show")
        public String showUsers(){
        return "Users:";
    }
    //Update user by ID
    @PutMapping("/update")
        public String updateUsers(){
        return "User updated";
    }
    //Delete user by ID
    @DeleteMapping("/delete")
        public String deleteUser(){
        return "User deleted.";
    }
}
