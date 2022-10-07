package sda.homework.myapphomework.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CourseAssignmentRequest {

    private boolean activeAssignment;
    private LocalDate assignmentToCourse;
    private LocalDate finishCourse;

    private Long studentId;
    private Long applicationUserId;
    private Long courseId;
}
