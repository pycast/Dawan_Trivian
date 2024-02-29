package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericService;

import java.util.List;

public interface QuestionService extends GenericService<QuestionDto> {
    List<QuestionDto> findByQuizId(long id);
}
