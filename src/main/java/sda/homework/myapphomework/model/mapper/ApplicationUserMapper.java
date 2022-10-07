package sda.homework.myapphomework.model.mapper;

import sda.homework.myapphomework.model.ApplicationUser;
import sda.homework.myapphomework.model.dto.ApplicationUserDto;

import java.util.List;
import java.util.stream.Collectors;

public class ApplicationUserMapper {

    private ApplicationUserMapper(){}

    public static ApplicationUserDto toApplicationUserDto (ApplicationUser applicationUser){
        if (applicationUser == null){
            return null;
        }

        return ApplicationUserDto.builder()
                .id(applicationUser.getId())
                .createDate(applicationUser.getCreateDate())
                .updateDate(applicationUser.getUpdateDate())
                .version(applicationUser.getVersion())
                .firstName(applicationUser.getFirstName())
                .lastName(applicationUser.getLastName())
                .phoneNumber(applicationUser.getPhoneNumber())
                .email(applicationUser.getEmail())
                .build();
    }

    public static ApplicationUser toApplicationUser (ApplicationUserDto applicationUserDto){
        if (applicationUserDto == null){
            return null;
        }

        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setId(applicationUserDto.getId());
        applicationUser.setCreateDate(applicationUserDto.getCreateDate());
        applicationUser.setUpdateDate(applicationUserDto.getUpdateDate());
        applicationUser.setVersion(applicationUserDto.getVersion());
        applicationUser.setFirstName(applicationUserDto.getFirstName());
        applicationUser.setLastName(applicationUserDto.getLastName());
        applicationUser.setPhoneNumber(applicationUserDto.getPhoneNumber());
        applicationUser.setEmail(applicationUserDto.getEmail());
        return applicationUser;
    }
    public static List<ApplicationUserDto> toApplicationUserDtos(List<ApplicationUser> applicationUsers) {
        return applicationUsers.stream()
                .map(ApplicationUserMapper::toApplicationUserDto)
                .collect(Collectors.toList());
    }
}