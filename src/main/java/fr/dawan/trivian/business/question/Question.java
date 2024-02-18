package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.answer.Answer;
import fr.dawan.trivian.business.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
    @OneToMany
    private List<Answer> answers;
}
