package fr.dawan.trivian.business.question;

import fr.dawan.trivian.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface QuestionMapper extends GenericMapper<Question, QuestionDto> {
}
