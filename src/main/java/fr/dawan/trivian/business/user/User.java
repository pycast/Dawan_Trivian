package fr.dawan.trivian.business.user;

import fr.dawan.trivian.business.generic.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    @ElementCollection
    private Set<Roles> roles = Set.of(Roles.PUBLIC);
}
