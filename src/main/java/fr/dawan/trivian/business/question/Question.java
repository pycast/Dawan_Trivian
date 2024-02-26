package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.answer.Answer;
import fr.dawan.trivian.business.generic.BaseEntity;
import fr.dawan.trivian.business.quiz.Quiz;
import jakarta.persistence.*;
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
public class Question extends BaseEntity {
    private String label;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<Answer> answers;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}
