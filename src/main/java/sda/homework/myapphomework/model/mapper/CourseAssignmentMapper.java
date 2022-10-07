package sda.homework.myapphomework.model.mapper;

import sda.homework.myapphomework.model.ApplicationUser;
import sda.homework.myapphomework.model.CourseAssignmentEntity;
import sda.homework.myapphomework.model.CourseEntity;
import sda.homework.myapphomework.model.StudentEntity;
import sda.homework.myapphomework.model.dto.ApplicationUserDto;
import sda.homework.myapphomework.model.dto.CourseAssignmentDto;
import sda.homework.myapphomework.model.dto.CourseDto;
import sda.homework.myapphomework.model.dto.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

public class CourseAssignmentMapper {

    private CourseAssignmentMapper() {}

    public static CourseAssignmentDto toCourseAssignmentDto (CourseAssignmentEntity courseAssignmentEntity){
        if (courseAssignmentEntity == null){
            return null;
        }

        StudentDto studentDto = StudentMapper.toStudentDto(courseAssignmentEntity.getStudent());
        ApplicationUserDto applicationUserDto = ApplicationUserMapper.toApplicationUserDto(courseAssignmentEntity.getApplicationUser());
        CourseDto courseDto = CourseMapper.toCourseDto(courseAssignmentEntity.getCourse());

        return CourseAssignmentDto.builder()
                .id(courseAssignmentEntity.getId())
                .createDate(courseAssignmentEntity.getCreateDate())
                .updateDate(courseAssignmentEntity.getUpdateDate())
                .version(courseAssignmentEntity.getVersion())
                .activeAssignment(courseAssignmentEntity.isActiveAssignment())
                .assignmentToCourse(courseAssignmentEntity.getAssignmentToCourse())
                .finishCourse(courseAssignmentEntity.getFinishCourse())
                .student(studentDto)
                .applicationUser(applicationUserDto)
                .course(courseDto)
                .build();
    }

    public static CourseAssignmentEntity toCourseAssignmentEntity (CourseAssignmentDto courseAssignmentDto){
        if (courseAssignmentDto == null){
            return null;
        }

        StudentEntity studentEntity = StudentMapper.toStudentEntity(courseAssignmentDto.getStudent());
        ApplicationUser applicationUser = ApplicationUserMapper.toApplicationUser(courseAssignmentDto.getApplicationUser());
        CourseEntity courseEntity = CourseMapper.toCourseEntity(courseAssignmentDto.getCourse());

        CourseAssignmentEntity courseAssignment = new CourseAssignmentEntity();
        courseAssignment.setId(courseAssignmentDto.getId());
        courseAssignment.setCreateDate(courseAssignmentDto.getCreateDate());
        courseAssignment.setUpdateDate(courseAssignmentDto.getUpdateDate());
        courseAssignment.setVersion(courseAssignmentDto.getVersion());
        courseAssignment.setActiveAssignment(courseAssignmentDto.isActiveAssignment());
        courseAssignment.setAssignmentToCourse(courseAssignmentDto.getAssignmentToCourse());
        courseAssignment.setFinishCourse(courseAssignmentDto.getFinishCourse());
        courseAssignment.setStudent(studentEntity);
        courseAssignment.setApplicationUser(applicationUser);
        courseAssignment.setCourse(courseEntity);
        return courseAssignment;
    }
    public static List<CourseAssignmentDto> toCourseAssignmentDtos(List<CourseAssignmentEntity> courseAssignments) {
        return courseAssignments.stream()
                .map(CourseAssignmentMapper::toCourseAssignmentDto)
                .collect(Collectors.toList());
    }
}
