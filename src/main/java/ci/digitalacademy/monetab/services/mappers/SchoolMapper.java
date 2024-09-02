package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.School;
import ci.digitalacademy.monetab.services.dto.SchoolDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface SchoolMapper extends EntityMapper<SchoolDTO, School>{
}
