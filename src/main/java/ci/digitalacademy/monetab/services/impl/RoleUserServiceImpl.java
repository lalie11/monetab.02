package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.services.RoleUserService;
import ci.digitalacademy.monetab.services.dto.RoleUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Override
    public RoleUserDTO save(RoleUserDTO roleUserDTO) {
        return null;
    }

    @Override
    public RoleUserDTO update(RoleUserDTO roleUserDTO) {
        return null;
    }

    @Override
    public Optional<RoleUserDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<RoleUserDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
