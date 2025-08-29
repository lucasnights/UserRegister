package dev.nights.UserRegister.Users;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> listUsers(){
        return userRepository.findAll();
    }
}
