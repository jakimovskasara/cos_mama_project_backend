package cos_mama_backend.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PaymentTest {

    private Payment payment;
    private User user;

    @BeforeEach
    void setUp() {
        // Setup a mock user or create a new user if it's a POJO without complex logic
        user = Mockito.mock(User.class);
        payment = new Payment(user);
    }

    @Test
    @DisplayName("Test payment instantiation with user")
    void testPaymentInstantiationWithUser() {
        assertSame(user, payment.getUser(), "The payment should be associated with the correct user.");
    }

    @Test
    @DisplayName("Test default constructor")
    void testDefaultConstructor() {
        Payment payment = new Payment();
        assertNotNull(payment.getUser(), "Default constructor should create a new user.");
    }

    @Test
    @DisplayName("Test setters and getters for id")
    void testIdSettersAndGetters() {
        Long id = 1L;
        payment.setId(id);
        assertEquals(id, payment.getId(), "The id should be set and retrieved correctly.");
    }

    @Test
    @DisplayName("Test setters and getters for user")
    void testUserSettersAndGetters() {
        User newUser = Mockito.mock(User.class);
        payment.setUser(newUser);
        assertSame(newUser, payment.getUser(), "The user should be set and retrieved correctly.");
    }

    @Test
    @DisplayName("Test updateUser method")
    void testUpdateUser() {
        User updatedUser = Mockito.mock(User.class);
        payment.updateUser(updatedUser);
        assertSame(updatedUser, payment.getUser(), "The user should be updated correctly.");
    }

    @Test
    @DisplayName("Test isAssociatedWith method")
    void testIsAssociatedWith() {
        assertTrue(payment.isAssociatedWith(user), "isAssociatedWith should return true for the associated user.");

        User anotherUser = Mockito.mock(User.class);
        assertFalse(payment.isAssociatedWith(anotherUser), "isAssociatedWith should return false for non-associated users.");
    }
}
