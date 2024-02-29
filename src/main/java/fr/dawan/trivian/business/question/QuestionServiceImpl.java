package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl extends GenericServiceImpl<Question, QuestionRepository,QuestionDto,QuestionMapper> implements QuestionService {
    public QuestionServiceImpl(QuestionRepository repository, QuestionMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<QuestionDto> findByQuizId(long id) {
        return repository.findByQuizId(id).stream().map(mapper::toDto).toList();
    }
}
