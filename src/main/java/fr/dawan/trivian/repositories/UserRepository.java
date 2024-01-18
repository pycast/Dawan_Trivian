package fr.dawan.trivian.repositories;

import fr.dawan.trivian.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
