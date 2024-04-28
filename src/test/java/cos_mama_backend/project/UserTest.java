package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private final String firstName = "John";
    private final String lastName = "Doe";
    private final String email = "john.doe@example.com";
    private final String password = "secure123";

    @BeforeEach
    void setUp() {
        user = new User(firstName, lastName, email, password);
    }

    @Test
    void testUserConstructor() {
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
    }

    @Test
    void testForgotPassword() {
        String token = "resetToken";
        LocalDateTime expiration = LocalDateTime.now().plusHours(1);
        user.forgotPassword(token, expiration);

        assertEquals(token, user.getForgotPasswordToken());
        assertEquals(expiration, user.getForgotPasswordExpiration());
    }

    @Test
    void testResetPassword() {
        String newPassword = "newSecure123";
        user.resetPassword(newPassword);

        assertEquals(newPassword, user.getPassword());
        assertNull(user.getForgotPasswordToken());
        assertNull(user.getForgotPasswordExpiration());
    }

    @Test
    void testEditUserInfo() {
        String newFirstName = "Jane";
        String newLastName = "Smith";
        String newEmail = "jane.smith@example.com";
        String newPhone = "1234567890";
        String newAddress = "321 Secondary St";
        String newPostalCode = "54321";

        user.editUserInfo(newFirstName, newLastName, newEmail, newPhone, newAddress, newPostalCode);

        assertEquals(newFirstName, user.getFirstName());
        assertEquals(newLastName, user.getLastName());
        assertEquals(newEmail, user.getEmail());
        assertEquals(newPhone, user.getPhone());
        assertEquals(newAddress, user.getAddress());
        assertEquals(newPostalCode, user.getPostalCode());
    }
}