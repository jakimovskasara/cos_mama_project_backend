package cos_mama_backend.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Long> {
    Subscription findByUserId(Long userId);
}