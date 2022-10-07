package sda.homework.myapphomework.model.mapper;

import sda.homework.myapphomework.model.CourseEntity;
import sda.homework.myapphomework.model.dto.CourseDto;

import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {

    private CourseMapper() {}

    public static CourseDto toCourseDto (CourseEntity courseEntity){
        if (courseEntity == null){
            return null;
        }

        return CourseDto.builder()
                .id(courseEntity.getId())
                .createDate(courseEntity.getCreateDate())
                .updateDate(courseEntity.getUpdateDate())
                .version(courseEntity.getVersion())
                .name(courseEntity.getName())
                .startDate(courseEntity.getStartDate())
                .endDate(courseEntity.getEndDate())
                .build();
    }

    public static CourseEntity toCourseEntity (CourseDto courseDto){
        if (courseDto == null){
            return null;
        }

        CourseEntity course = new CourseEntity();
        course.setId(courseDto.getId());
        course.setCreateDate(courseDto.getCreateDate());
        course.setUpdateDate(courseDto.getUpdateDate());
        course.setVersion(courseDto.getVersion());
        course.setName(courseDto.getName());
        course.setStartDate(courseDto.getStartDate());
        course.setEndDate(courseDto.getEndDate());
        return course;
    }
    public static List<CourseDto> toCourseDtos(List<CourseEntity> courses) {
        return courses.stream()
                .map(CourseMapper::toCourseDto)
                .collect(Collectors.toList());
    }
}
