package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController extends GenericController<QuestionDto, QuestionService> {

    public QuestionController(QuestionService service) {
        super(service);
    }
}
