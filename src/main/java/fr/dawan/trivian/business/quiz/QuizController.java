package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
@CrossOrigin(origins = "http://localhost:5173/")
public class QuizController extends GenericController<QuizDto, QuizService> {
    public QuizController(QuizService service) {
        super(service);
    }
}
