package cos_mama_backend.project;

import java.time.LocalDate;

public class Event {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private String organizer;
    private String category;

    // Getters and setters for all fields

    public Event(String name, String description, LocalDate startDate, LocalDate endDate, String location, String organizer, String category) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.organizer = organizer;
        this.category = category;
    }

    // Add any additional methods you need for your Event class here
}
