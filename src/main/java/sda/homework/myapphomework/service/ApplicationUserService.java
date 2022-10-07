package sda.homework.myapphomework.service;

import sda.homework.myapphomework.model.dto.ApplicationUserDto;
import sda.homework.myapphomework.model.dto.CreateUserRequest;

import java.util.List;

public interface ApplicationUserService {

    /**
     * Persists the passed applicationUser.
     * If the applicationUser has already DB ID assigned, then the implementation might throw an {@link IllegalArgumentException}.
     *
     * @param request - params of applicationUser to create
     * @return created {@link ApplicationUserDto}
     */
    ApplicationUserDto createUser(CreateUserRequest request);

    List<ApplicationUserDto> listUsers();
}
