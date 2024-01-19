package fr.dawan.trivian.mappers;

import fr.dawan.trivian.dto.user.fullUserDto;
import fr.dawan.trivian.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends GenericMapper<User, fullUserDto> {
}
