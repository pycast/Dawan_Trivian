package fr.dawan.trivian.business.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long id;
    private int version;
    private String username;
    private String email;
    private Set<Roles> roles;
}