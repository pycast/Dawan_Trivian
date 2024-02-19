package fr.dawan.trivian.business.answer;

import lombok.Data;

@Data
public class AnswerDto {
    private String label;
    private long question_id;
    private boolean isCorrect;
}
