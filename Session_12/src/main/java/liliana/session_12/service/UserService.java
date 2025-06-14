package liliana.session_12.service;


import liliana.session_12.dao.UserDao;
import liliana.session_12.entity.User;

import java.util.List;

public class UserService {
    private UserDao dao = new UserDao();

    public List<User> findAll() {
        return dao.getAll();
    }

    public void save(User s) {
        if (s.getId() == 0) {
            dao.insert(s);
        } else {
            dao.update(s);
        }
    }

    public void delete(int id) {
        dao.delete(id);
    }

    public User findById(int id) {
        return dao.findById(id);
    }
}

