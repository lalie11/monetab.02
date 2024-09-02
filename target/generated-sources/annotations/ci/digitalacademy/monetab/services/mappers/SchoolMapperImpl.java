package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.School;
import ci.digitalacademy.monetab.services.dto.SchoolDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-01T17:54:29+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class SchoolMapperImpl implements SchoolMapper {

    @Override
    public SchoolDTO toDto(School entity) {
        if ( entity == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        return schoolDTO;
    }

    @Override
    public School toEntity(SchoolDTO dto) {
        if ( dto == null ) {
            return null;
        }

        School school = new School();

        return school;
    }
}
