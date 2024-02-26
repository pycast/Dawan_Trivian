package fr.dawan.trivian.business.category;

import fr.dawan.trivian.business.answer.Answer;
import fr.dawan.trivian.business.generic.BaseEntity;
import fr.dawan.trivian.business.quiz.Quiz;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {
    private String label;
}
