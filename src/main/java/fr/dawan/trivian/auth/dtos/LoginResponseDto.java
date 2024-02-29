package fr.dawan.trivian.auth.dtos;

import fr.dawan.trivian.business.user.Roles;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

@Value
public class LoginResponseDto implements Serializable{
	UserDto user;
	String token;

	@Value
	public static class UserDto {
		long id;
		String username;
		String email;
		Set<Roles> roles;
	}
}
