package sda.homework.myapphomework.service;

import sda.homework.myapphomework.model.dto.CourseDto;

import javax.persistence.EntityNotFoundException;

public interface CourseService {
    /**
     * Persists the passed course.
     * If the course has already DB ID assigned, then the implementation might throw an {@link IllegalArgumentException}.
     *
     * @param courseDto - params of course to create
     * @return created {@link CourseDto}
     */
    CourseDto createCourse(CourseDto courseDto);

    /**
     * Update the passed course.
     * If the course does not exist in DB, then the implementation might throw an {@link IllegalArgumentException}.
     *
     * @param courseDto - params of course to create
     * @return updated {@link CourseDto}
     */
    CourseDto updateCourse(CourseDto courseDto);

    /**
     * Delete the passed course.
     * If the course does not exist in DB, then the implementation might throw an {@link EntityNotFoundException}.
     *
     * @param courseId - id of course to delete
     */
    void deleteCourseById(Long courseId);
}
