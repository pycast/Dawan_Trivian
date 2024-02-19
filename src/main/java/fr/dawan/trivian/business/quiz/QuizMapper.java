package fr.dawan.trivian.business.quiz;

import fr.dawan.trivian.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface QuizMapper extends GenericMapper<Quiz,QuizDto> {
}
