package usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usermanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
