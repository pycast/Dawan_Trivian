package fr.dawan.Trivian.repositories;

import fr.dawan.Trivian.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
