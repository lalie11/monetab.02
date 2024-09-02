package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.RoleUser;
import ci.digitalacademy.monetab.services.dto.RoleUserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-01T17:54:29+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class RoleUserMapperImpl implements RoleUserMapper {

    @Override
    public RoleUserDTO toDto(RoleUser entity) {
        if ( entity == null ) {
            return null;
        }

        RoleUserDTO roleUserDTO = new RoleUserDTO();

        roleUserDTO.setId( entity.getId() );
        roleUserDTO.setRole( entity.getRole() );

        return roleUserDTO;
    }

    @Override
    public RoleUser toEntity(RoleUserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RoleUser roleUser = new RoleUser();

        roleUser.setId( dto.getId() );
        roleUser.setRole( dto.getRole() );

        return roleUser;
    }
}
