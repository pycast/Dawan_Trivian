package fr.dawan.trivian.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class fullUserDto {
    private long id;
    private int version;
    private String username;
    private String email;
    private String password;
}