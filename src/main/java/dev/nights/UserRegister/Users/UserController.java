package dev.nights.UserRegister.Users;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/welcomeUser")
    public String welcome(){
        return "Hello, user!";
    }

    //Register user
    @PostMapping("/register")
    public String userRegister(){
        return "User registered";
        }
    //Show registered users
    @GetMapping("/show")
    public List<UserModel> UserList(){
        return userService.listUsers();
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
