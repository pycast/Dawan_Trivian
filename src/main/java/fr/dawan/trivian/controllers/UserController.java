package fr.dawan.trivian.controllers;

import fr.dawan.trivian.dto.user.fullUserDto;
import fr.dawan.trivian.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("users")
public class UserController extends GenericController<fullUserDto, UserService> {

    public UserController(UserService service) {
        super(service);
    }

}