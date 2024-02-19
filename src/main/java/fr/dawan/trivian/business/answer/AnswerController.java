package fr.dawan.trivian.business.answer;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("answers")
public class AnswerController extends GenericController<AnswerDto,AnswerService> {
    public AnswerController(AnswerService service) {
        super(service);
    }
}
