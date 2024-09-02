package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.dto.AbsenceDTO;
import ci.digitalacademy.monetab.services.dto.AdressDTO;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {

    AbsenceDTO save(AbsenceDTO absenceDTO);

    AbsenceDTO update(AbsenceDTO absenceDTO);

    Optional<AbsenceDTO> findOne(Long id);

    List<AbsenceDTO> findAll();

    void delete(Long id);
}
