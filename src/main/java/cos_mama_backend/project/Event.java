package cos_mama_backend.project;

import java.time.LocalDate;

public class Event {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    

    // Getters and setters for all fields

    public Event(String name, String description, LocalDate startDate, LocalDate endDate, String location) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
    }

    // Add any additional methods here
}
