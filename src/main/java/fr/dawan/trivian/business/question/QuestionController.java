package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("questions")
@CrossOrigin(origins = "http://localhost:5173/")
public class QuestionController extends GenericController<QuestionDto, QuestionService> {

    public QuestionController(QuestionService service) {
        super(service);
    }

    @GetMapping("/quiz/{id}")
    public List<QuestionDto> findByQuizId(@PathVariable long id) {
        return service.findByQuizId(id);
    }
}
