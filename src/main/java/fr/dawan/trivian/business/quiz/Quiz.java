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
    private String label;
    private int difficulty = 0;
    @ManyToMany
    @JoinTable(name="Quiz_Category")
    private List<Category> categories;
    private double rating = 0;
    @Temporal(TemporalType.DATE)
    private Date createDate;
    private int flags = 0;
    private boolean visible = false;
    @ManyToOne
    @JoinColumn(name="author_id")
    private User user;
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.REMOVE)
    private List<Question> questions;
}