package fr.dawan.trivian.business.answer;

import fr.dawan.trivian.business.generic.BaseEntity;
import fr.dawan.trivian.business.question.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer extends BaseEntity {
    private String label;
    private boolean correct;
}
