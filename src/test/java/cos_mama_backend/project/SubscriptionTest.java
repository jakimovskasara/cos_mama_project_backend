package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubscriptionTest {

    private Subscription subscription;
    private User user;
    private Plan plan;

    @BeforeEach
    void setUp() {
        // Assuming User and Plan have parameterized constructors
        user = new User("John", "Doe", "john.doe@example.com", "password123");
        plan = new Plan("Basic Plan", 9.99);

        subscription = new Subscription(user, plan);
    }

    @Test
    void testSubscriptionConstructor() {
        assertNotNull(subscription);
        assertEquals(user, subscription.getUser());
        assertEquals(plan, subscription.getPlan());
    }

    @Test
    void testGetters() {
        assertEquals(user, subscription.getUser());
        assertEquals(plan, subscription.getPlan());
    }

    @Test
    void testSetters() {
        User newUser = new User("Jane", "Smith", "jane.smith@example.com", "password123");
        Plan newPlan = new Plan("Premium Plan", 19.99);

        subscription.setUser(newUser);
        subscription.setPlan(newPlan);

        assertEquals(newUser, subscription.getUser());
        assertEquals(newPlan, subscription.getPlan());
    }

    @Test
    void testToString() {
        String expectedToString = "Subscription{" +
                "id=" + subscription.getId() +
                ", user=" + user +
                ", plan=" + plan +
                '}';
        assertEquals(expectedToString, subscription.toString());
    }
}