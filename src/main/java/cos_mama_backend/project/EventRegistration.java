package cos_mama_backend.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EventRegistration {

    @Autowired
    private EventRepo eventRepo;

    public Event registerEvent(String name, String description, LocalDateTime startDate, LocalDateTime endDate, String location) {
        Event newEvent = new Event(name, description, startDate, endDate, location);
        return eventRepo.save(newEvent);
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepo.findById(id);
    }

    // Add any additional methods here
}
