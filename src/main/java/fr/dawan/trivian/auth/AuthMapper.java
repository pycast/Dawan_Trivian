package fr.dawan.trivian.auth;

import fr.dawan.trivian.auth.dtos.LoginResponseDto;
import fr.dawan.trivian.auth.dtos.RegisterDto;
import fr.dawan.trivian.business.user.User;
import fr.dawan.trivian.business.user.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {UserMapper.class})
public interface AuthMapper {

    User fromRegister(RegisterDto registerDto);
    @Mapping(target = "token", expression = "java(fr.dawan.trivian.auth.tools.JwtUtils.generateToken(security))")
    LoginResponseDto toResponse(UserSecurity security);
}
