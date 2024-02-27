package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.category.CategoryDto;
import fr.dawan.trivian.business.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private long id;
    private int version;
    private String label;
    private List<CategoryDto> categories;
    private UserDto user;
    private List<QuestionDto> questions;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class QuestionDto {
        private long id;
        private String label;
        private List<AnswerDto> answers;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class AnswerDto {
            private long id;
            private String label;
        }
    }
}
