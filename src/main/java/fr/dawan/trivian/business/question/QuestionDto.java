package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.answer.AnswerDto;
import fr.dawan.trivian.business.quiz.QuizDto;
import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    private long id;
    private int version;
    private String label;
    private QuizDto quiz;
    private List<AnswerDto> answers;
}
