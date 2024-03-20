package cos_mama_backend.project;

import java.sql.SQLException;
import java.util.List;

public interface AdminRepo {
    List<User> getUsers() throws SQLException;

    boolean createUser(String username, String password) throws SQLException;

    Connection getConnection() throws SQLException;

    void closeConnection() throws SQLException;
}
