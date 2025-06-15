package liliana.session_14.service;

import liliana.session_14.dto.LoginRequest;
import liliana.session_14.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = Arrays.asList(
            new User(1, "baotran", "123")
    );

    public User login (LoginRequest loginRequest) {
        for (User user : users) {
            if (user.getPassword().equals(loginRequest.getPassword()) && user.getUsername().equals(loginRequest.getUsername())) {
                return user;
            }
        }
        return null;
    }

    public boolean isExitUser (String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
