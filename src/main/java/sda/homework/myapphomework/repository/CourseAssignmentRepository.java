package sda.homework.myapphomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.homework.myapphomework.model.CourseAssignmentEntity;

@Repository
public interface CourseAssignmentRepository extends JpaRepository<CourseAssignmentEntity, Long> {
}
