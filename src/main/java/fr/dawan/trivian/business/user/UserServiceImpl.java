package fr.dawan.trivian.business.user;


import fr.dawan.trivian.auth.UserSecurity;
import fr.dawan.trivian.business.generic.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, UserRepository, UserDto, UserMapper> implements UserService {

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public UserSecurity loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByEmail(username).map(UserSecurity::new).orElseThrow();
    }
}