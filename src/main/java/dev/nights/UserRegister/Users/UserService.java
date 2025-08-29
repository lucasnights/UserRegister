package dev.nights.UserRegister.Users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

     final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //List all users
    public List<UserModel> listUsers() {
        return userRepository.findAll();
    }


    //List users using the id search
    public UserModel listUsersById(Long id) {
        Optional<UserModel> userById = userRepository.findById(id);
        return userById.orElse(null);
}
}
