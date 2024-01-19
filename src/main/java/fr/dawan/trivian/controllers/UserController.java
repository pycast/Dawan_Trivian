package fr.dawan.trivian.controllers;

import fr.dawan.trivian.dto.user.fullUserDto;
import fr.dawan.trivian.entities.User;
import fr.dawan.trivian.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController extends GenericController<fullUserDto, UserService> {

    public UserController(UserService service) {
        super(service);
    }

}