package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl extends GenericServiceImpl<Quiz, QuizRepository, QuizDto, QuizMapper> implements QuizService{
    public QuizServiceImpl(QuizRepository repository, QuizMapper mapper) {
        super(repository, mapper);
    }
}
