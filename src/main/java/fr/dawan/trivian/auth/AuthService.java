package fr.dawan.trivian.auth;


import fr.dawan.trivian.auth.dtos.LoginDto;
import fr.dawan.trivian.auth.dtos.LoginResponseDto;
import fr.dawan.trivian.auth.dtos.RegisterDto;

public interface AuthService {

    void register(RegisterDto register);
    LoginResponseDto authenticate(LoginDto login) throws Exception;
}
