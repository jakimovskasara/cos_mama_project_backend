package cos_mama_backend.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface AdminRepo {
    List<User> getUsers() throws SQLException;

    boolean createUser(String username, String password) throws SQLException;

    Connection getConnection() throws SQLException;

    void closeConnection() throws SQLException;

    // Events CRUD
    List<Event> getAllEvents() throws SQLException;

    Event getEvent(int id) throws SQLException;

    void createEvent(String name, String description, LocalDate startDate, LocalDate endDate, String location) throws SQLException;

    void updateEvent(int id, String name, String description, LocalDate startDate, LocalDate endDate, String location) throws SQLException;

    void deleteEvent(int id) throws SQLException;

    // Blog CRUD
    List<Blog> getAllBlogs() throws SQLException;

    Blog getBlog(int id) throws SQLException;

    void createBlog(String title, String content, LocalDate publishDate, String author) throws SQLException;

    void updateBlog(int id, String title, String content, LocalDate publishDate, String author) throws SQLException;

    void deleteBlog(int id) throws SQLException;
}
