package ee.tu.app.web.rest.mapper;


import ee.tu.app.api.model.*;
import ee.tu.app.service.dto.*;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PersonXrMapper {

    XRPerson toXr(PersonDto element);
    XRUserAccountInfo toXr(UserAccountInfoDto userAccountInfoDto);
    XRContactInfo toXr(ContactInfoDto userAccountInfoDto);
    XRPersonDetails toXr(PersonDetailsDto personDetailsDto);
    XREducation toXr(EducationDto educationDtoList);
    XRWorkRelation toXr(WorkRelationDto workRelationDtoList);
    BankAccountDto toDto(XRBankAccount xrBankAccount);
    PersonSearchRequestDto toDto(XRPersonSearchRequest xrBankAccount);
    ContactInfoUpdateRequestDto toDto(XRContactInfoUpdateRequest xrBankAccount);
}
