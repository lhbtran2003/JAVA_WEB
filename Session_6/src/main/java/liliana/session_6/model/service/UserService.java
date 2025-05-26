package liliana.session_6.model.service;

import liliana.session_6.model.dao.UserDAO;
import liliana.session_6.model.entity.User;

public class UserService {
    private final UserDAO userDAO;
    private static UserService instance;

    public UserService(UserDAO userDAO) {
        this.userDAO = UserDAO.getInstance();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService(new UserDAO());
        }
        return instance;
    }

    public User login(String email, String password) {
        return userDAO.login(email, password);
    }

    public void register(User user) {
        userDAO.register(user);
    }

    public boolean isUserNameExist(String username) {
        return userDAO.isUsernameExists(username);
    }
}
