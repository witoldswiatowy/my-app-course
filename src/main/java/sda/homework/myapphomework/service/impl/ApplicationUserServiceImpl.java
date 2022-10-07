package sda.homework.myapphomework.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sda.homework.myapphomework.exception.ParamsIsEmptyException;
import sda.homework.myapphomework.model.ApplicationUser;
import sda.homework.myapphomework.model.dto.ApplicationUserDto;
import sda.homework.myapphomework.model.dto.CreateUserRequest;
import sda.homework.myapphomework.model.mapper.ApplicationUserMapper;
import sda.homework.myapphomework.repository.ApplicationUserRepository;
import sda.homework.myapphomework.service.ApplicationUserService;

import java.util.List;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ApplicationUserServiceImpl implements ApplicationUserService {
    private final ApplicationUserRepository applicationUserRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserDto createUser(CreateUserRequest request) {
        validateCorrectDtoForCrud(request);
        ApplicationUser newUser = ApplicationUserMapper.createRequestToApplicationUser(request);
        ApplicationUser savedApplicationUser = applicationUserRepository.save(newUser);
        log.info("Create applicationUser {}", savedApplicationUser);
        return ApplicationUserMapper.toApplicationUserDto(savedApplicationUser);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ApplicationUserDto> listUsers() {
        return ApplicationUserMapper.toApplicationUserDtos(applicationUserRepository.findAll());
    }

    private void validateCorrectDtoForCrud(CreateUserRequest request) {
        if (request == null) {
            log.error("Object what you want to save is null!");
            throw new IllegalArgumentException();
        }
        if (request.getLogin() == null || request.getLogin().isBlank()){
            log.error("Can not create applicationUser without login!");
            throw new ParamsIsEmptyException("Can not create applicationUser without login!");
        }
        if (request.getPass() == null || request.getPass().isBlank()){
            log.error("Can not create applicationUser without pass!");
            throw new ParamsIsEmptyException("Can not create applicationUser without pass!");
        }
        if (request.getName() == null || request.getName().isBlank()){
            log.error("Can not create applicationUser without first name!");
            throw new ParamsIsEmptyException("Can not create applicationUser without first name!");
        }
        if (request.getSurname() == null || request.getSurname().isBlank()){
            log.error("Can not create applicationUser without last name!");
            throw new ParamsIsEmptyException("Can not create applicationUser without last name!");
        }
    }
}
