package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.category.Category;
import fr.dawan.trivian.business.question.Question;
import fr.dawan.trivian.business.user.User;
import fr.dawan.trivian.business.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz extends BaseEntity {
    private String name;
    private int difficulty;
    @ManyToMany
    @JoinTable(name="Quiz_Category")
    private List<Category> categories;
    private double rating;
    private Date createDate;
    private int flags;
    @OneToMany
    private List<Question> questions;
    private boolean visible;
    @ManyToOne
    private User author;
}
