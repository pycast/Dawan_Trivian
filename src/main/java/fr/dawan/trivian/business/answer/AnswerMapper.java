package fr.dawan.trivian.business.answer;

import fr.dawan.trivian.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AnswerMapper extends GenericMapper<Answer,AnswerDto> {
}
