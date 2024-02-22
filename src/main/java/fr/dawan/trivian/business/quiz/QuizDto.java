package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.category.Category;
import fr.dawan.trivian.business.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private String label;
    private List<Category> categories;
    private User user;
}
