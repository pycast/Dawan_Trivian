package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl extends GenericServiceImpl<Question, QuestionRepository,QuestionDto,QuestionMapper> implements QuestionService {
    public QuestionServiceImpl(QuestionRepository repository, QuestionMapper mapper) {
        super(repository, mapper);
    }
}
