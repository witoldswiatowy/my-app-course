package sda.homework.myapphomework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationUserDto {

    private Long id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private Long version;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private String username;

    private Set<CourseAssignmentDto> courseAssignmentDtoSet;


}
