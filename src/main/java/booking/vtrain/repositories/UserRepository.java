package booking.vtrain.repositories;

import booking.vtrain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    // You can define additional methods for more specific queries if needed
}
