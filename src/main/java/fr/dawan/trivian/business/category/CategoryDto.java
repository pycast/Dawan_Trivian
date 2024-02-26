package fr.dawan.trivian.business.category;

import lombok.Data;

@Data
public class CategoryDto {
    private long id;
    private int version;
    private String label;
}
