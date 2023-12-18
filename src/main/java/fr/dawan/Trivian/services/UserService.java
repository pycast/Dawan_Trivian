package fr.dawan.Trivian.services;

import fr.dawan.Trivian.entities.User;
import fr.dawan.Trivian.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();
    }
    public User getById(long id){
        return repository.getById(id);
    }
}
