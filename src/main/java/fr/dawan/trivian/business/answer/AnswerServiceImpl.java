package fr.dawan.trivian.business.answer;

import fr.dawan.trivian.business.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl extends GenericServiceImpl<Answer,AnswerRepository,AnswerDto,AnswerMapper> implements AnswerService {
    public AnswerServiceImpl(AnswerRepository repository, AnswerMapper mapper) {
        super(repository, mapper);
    }
}
