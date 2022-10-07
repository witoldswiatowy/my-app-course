package sda.homework.myapphomework.service;

import sda.homework.myapphomework.model.dto.StudentDto;

import javax.persistence.EntityNotFoundException;

public interface StudentService {

    /**
     * Persists the passed student.
     * If the student has already DB ID assigned, then the implementation might throw an {@link IllegalArgumentException}.
     *
     * @param studentDto - params of student to create
     * @return created {@link StudentDto}
     */
    StudentDto createStudent(StudentDto studentDto);

    /**
     * Update the passed student.
     * If the student does not exist in DB, then the implementation might throw an {@link IllegalArgumentException}.
     *
     * @param studentDto - params of student to create
     * @return updated {@link StudentDto}
     */
    StudentDto updateStudent(StudentDto studentDto);

    /**
     * Delete the passed student.
     * If the student does not exist in DB, then the implementation might throw an {@link EntityNotFoundException}.
     *
     * @param studentId - id of student to delete
     */
    void deleteStudentById(Long studentId);
}
