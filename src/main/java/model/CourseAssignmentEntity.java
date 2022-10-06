package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course_assignment")
public class CourseAssignmentEntity extends BaseEntity{

    private boolean activeAssignment;

    @ManyToOne
    private StudentEntity student;
    @ManyToOne
    private InstructorEntity instructor;
    @ManyToOne
    private CourseEntity course;
}
