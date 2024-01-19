package fr.dawan.trivian.services;


import fr.dawan.trivian.dto.user.fullUserDto;
import fr.dawan.trivian.entities.User;
import fr.dawan.trivian.mappers.UserMapper;
import fr.dawan.trivian.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserRepository, fullUserDto, UserMapper> implements UserService {

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}