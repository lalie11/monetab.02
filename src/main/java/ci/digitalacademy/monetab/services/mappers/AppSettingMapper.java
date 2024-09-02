package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.AppSetting;
import ci.digitalacademy.monetab.services.dto.AppSettingDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AppSettingMapper extends EntityMapper<AppSettingDTO, AppSetting>{
}
