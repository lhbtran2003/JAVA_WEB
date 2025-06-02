package liliana.session_9.model.service.ex1;

import liliana.session_9.model.dao.ex1.ILoginDAO;
import liliana.session_9.model.dao.ex1.LoginDAOImpl;
import liliana.session_9.model.entity.ex1.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private LoginDAOImpl loginDAO;
    @Override
    public String login(LoginDTO loginDTO) {
        return loginDAO.login(loginDTO);
    }
}
