package ee.tu.app.web.mapper;

import ee.tu.app.api.model.XRUserAccountInfo;
import ee.tu.app.service.dto.UserAccountInfoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAccountInfoXrMapper {
    XRUserAccountInfo toXr(UserAccountInfoDto userAccountInfoDto);
}
