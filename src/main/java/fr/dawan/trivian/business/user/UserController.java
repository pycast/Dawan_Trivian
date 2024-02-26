package fr.dawan.trivian.business.user;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:5173/")
public class UserController extends GenericController<UserDto, UserService> {

    public UserController(UserService service) {
        super(service);
    }

}