package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.user.User;
import fr.dawan.trivian.business.generic.BaseEntity;
import jakarta.persistence.Entity;
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
    private List<Category> categories;
    private double rating;
    private Date createDate;
    private int flags;
    private List<Category.Question> questions;
    private boolean visible;
    private User author;

}
