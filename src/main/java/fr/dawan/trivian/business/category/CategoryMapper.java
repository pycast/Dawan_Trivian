package fr.dawan.trivian.business.category;

import fr.dawan.trivian.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper extends GenericMapper<Category,CategoryDto> {
}
