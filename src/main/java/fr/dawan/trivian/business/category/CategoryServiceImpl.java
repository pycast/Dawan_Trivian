package fr.dawan.trivian.business.category;

import fr.dawan.trivian.business.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, CategoryRepository, CategoryDto, CategoryMapper> implements CategoryService {
    public CategoryServiceImpl(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);
    }
}
