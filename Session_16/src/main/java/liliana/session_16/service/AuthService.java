package liliana.session_16.service;

import liliana.session_16.model.dto.UserDTO;
import liliana.session_16.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    private List<User> users = new ArrayList<User>();

    public AuthService() {
        // Tạo sẵn 1 user để bạn login test, không gọi là "dữ liệu mẫu"
        User user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("123");
        user.setRole("admin");
        user.setStatus(true);
        users.add(user);
    }

    public User login(String username, String password) {
        return users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findFirst().orElse(null);
    }

    public void register(String username, String password, String email) {
        int nextId = users.stream().mapToInt(User::getId).max().orElse(0) + 1;
        User user = new User();
        user.setId(nextId);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setRole("USER");
        user.setStatus(true);
        users.add(user);
    }

    public boolean isExistEmail(String email) {
        return users.stream().anyMatch(user -> user.getEmail().equals(email));
    }
}
