package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    private Event event;

    @BeforeEach
    void setUp() {
        // Create an event object with known values before each test
        event = new Event("Event Name", "Event Description", LocalDate.now(), LocalDate.now().plusDays(1), "Event Location");
    }

    @Test
    @DisplayName("Test Event instantiation with valid arguments")
    void testEventInstantiation() {
        assertNotNull(event, "Event object should not be null after instantiation");
        assertEquals("Event Name", event.getName(), "Event name should match the constructor argument");
        // Add assertions for other fields
    }

    @Test
    @DisplayName("Test getters and setters for all fields")
    void testGettersAndSetters() {
        event.setName("New Event Name");
        assertEquals("New Event Name", event.getName(), "Getter or setter for name is not working as expected");

        // Repeat for all fields
    }

    @Test
    @DisplayName("Test startDate and endDate logic")
    void testDateLogic() {
        // Check if endDate is later than startDate
        assertTrue(event.getEndDate().isAfter(event.getStartDate()), "End date should be after start date");

        // Test boundary conditions if applicable
    }
}