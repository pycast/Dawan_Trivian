package fr.dawan.trivian.business.category;

import fr.dawan.trivian.business.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController extends GenericController<CategoryDto, CategoryService> {
    public CategoryController(CategoryService service) {
        super(service);
    }
}
