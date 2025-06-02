package liliana.session_9.model.dao.ex1;

import liliana.session_9.configs.DBConnection;
import liliana.session_9.model.entity.ex1.LoginDTO;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class LoginDAOImpl implements ILoginDAO {
    private final String GETACCOUNT = "{CALL getAccountInfo(?,?,?)}";

    @Override
    public String login(LoginDTO loginDTO) {
        Connection con = DBConnection.getConnection();
        try {
            CallableStatement cstmt = con.prepareCall(GETACCOUNT);
            cstmt.setString(1, loginDTO.getUsername());
            cstmt.setString(2, loginDTO.getPassword());
            cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            cstmt.execute();
            return cstmt.getString(3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
