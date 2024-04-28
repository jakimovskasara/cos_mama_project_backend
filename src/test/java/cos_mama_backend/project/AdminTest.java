package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin("admin", "password123");
    }

    @Test
    void testUsernameGetterSetter() {
        // Check initial username
        assertEquals("admin", admin.getUsername());

        // Change username and verify
        admin.setUsername("newAdmin");
        assertEquals("newAdmin", admin.getUsername());
    }

    @Test
    void testPasswordGetterSetter() {
        // Check initial password
        assertEquals("password123", admin.getPassword());

        // Change password and verify
        admin.setPassword("newPassword");
        assertEquals("newPassword", admin.getPassword());
    }

    @Test
    void testVerifyUser() {
        // Verify correct credentials
        assertTrue(admin.verifyUser("admin", "password123"));

        // Verify incorrect username
        assertFalse(admin.verifyUser("wrongUser", "password123"));

        // Verify incorrect password
        assertFalse(admin.verifyUser("admin", "wrongPassword"));
    }
}