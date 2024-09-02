package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.AppSetting;
import ci.digitalacademy.monetab.services.dto.AppSettingDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-01T17:54:29+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class AppSettingMapperImpl implements AppSettingMapper {

    @Override
    public AppSettingDTO toDto(AppSetting entity) {
        if ( entity == null ) {
            return null;
        }

        AppSettingDTO appSettingDTO = new AppSettingDTO();

        return appSettingDTO;
    }

    @Override
    public AppSetting toEntity(AppSettingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AppSetting appSetting = new AppSetting();

        return appSetting;
    }
}
