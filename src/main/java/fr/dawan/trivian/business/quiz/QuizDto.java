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
}
