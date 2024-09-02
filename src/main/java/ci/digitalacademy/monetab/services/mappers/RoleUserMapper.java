package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.RoleUser;
import ci.digitalacademy.monetab.services.dto.RoleUserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface RoleUserMapper extends EntityMapper<RoleUserDTO, RoleUser>{
}
