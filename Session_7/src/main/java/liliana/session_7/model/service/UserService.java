package liliana.session_7.model.service;

import liliana.session_7.model.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean isExitByEmail(String email) {
        return false;
    }

    public void registerUser(User user) {

    }
}
