package fr.dawan.trivian.entities;

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
public class Quiz extends BaseEntity{
    private String name;
    private int difficulty;
    private List<Category> categories;
    private double rating;
    private Date createDate;
    private int flags;
    private List<Question> questions;
    private boolean visible;
    private User author;

}
