package sda.homework.myapphomework.model.mapper;

import sda.homework.myapphomework.model.StudentEntity;
import sda.homework.myapphomework.model.dto.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    private StudentMapper() {}
    
    public static StudentDto toStudentDto (StudentEntity studentEntity){
        if (studentEntity == null){
            return null;
        }

        return StudentDto.builder()
                .id(studentEntity.getId())
                .createDate(studentEntity.getCreateDate())
                .updateDate(studentEntity.getUpdateDate())
                .version(studentEntity.getVersion())
                .firstName(studentEntity.getFirstName())
                .lastName(studentEntity.getLastName())
                .phoneNumber(studentEntity.getPhoneNumber())
                .email(studentEntity.getEmail())
                .build();
    }

    public static StudentEntity toStudentEntity (StudentDto studentDto){
        if (studentDto == null){
            return null;
        }

        StudentEntity student = new StudentEntity();
        student.setId(studentDto.getId());
        student.setCreateDate(studentDto.getCreateDate());
        student.setUpdateDate(studentDto.getUpdateDate());
        student.setVersion(studentDto.getVersion());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        student.setEmail(studentDto.getEmail());
        return student;
    }
    public static List<StudentDto> toStudentDtos(List<StudentEntity> students) {
        return students.stream()
                .map(StudentMapper::toStudentDto)
                .collect(Collectors.toList());
    }
}
