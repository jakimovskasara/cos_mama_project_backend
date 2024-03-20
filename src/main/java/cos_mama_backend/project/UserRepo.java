package cos_mama_backend.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUserById(Long id);
}
