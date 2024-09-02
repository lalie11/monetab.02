package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.services.AbsenceService;
import ci.digitalacademy.monetab.services.dto.AbsenceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceServiceImpl implements AbsenceService {
    @Override
    public AbsenceDTO save(AbsenceDTO absenceDTO) {
        return null;
    }

    @Override
    public AbsenceDTO update(AbsenceDTO absenceDTO) {
        return null;
    }

    @Override
    public Optional<AbsenceDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<AbsenceDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
