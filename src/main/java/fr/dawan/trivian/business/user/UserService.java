package fr.dawan.trivian.business.user;

import fr.dawan.trivian.auth.UserSecurity;
import fr.dawan.trivian.business.generic.GenericService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService, GenericService<UserDto> {
    @Override
    UserSecurity loadUserByUsername(String username) throws UsernameNotFoundException;
}
