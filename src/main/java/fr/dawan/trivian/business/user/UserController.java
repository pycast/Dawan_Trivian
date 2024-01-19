package fr.dawan.trivian.business.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("users")
public class UserController extends GenericController<fullUserDto, UserService> {

    public UserController(UserService service) {
        super(service);
    }

}