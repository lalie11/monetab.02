package ci.digitalacademy.monetab.services.mappers.impl;

import ci.digitalacademy.monetab.models.Absence;
import ci.digitalacademy.monetab.services.dto.AbsenceDTO;
import ci.digitalacademy.monetab.services.mappers.AbsenceMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AbsenceMapperImpl implements AbsenceMapper {

    private final ModelMapper modelMapper;

    @Override
    public AbsenceDTO toDto(Absence entity) {
        return modelMapper.map(entity, AbsenceDTO.class);
    }

    @Override
    public Absence toEntity(AbsenceDTO dto) {
        return modelMapper.map(dto, Absence.class);
    }
}
