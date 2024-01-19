package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.generic.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class Category extends BaseEntity {
    private String name;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Question extends BaseEntity {
        private String questions;
        private List<Answers> answers;
    }
}
