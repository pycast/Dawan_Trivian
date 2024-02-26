package fr.dawan.trivian.business.answer;

import lombok.Data;

@Data
public class AnswerDto {
    private long id;
    private int version;
    private String label;
    private boolean correct;
}
