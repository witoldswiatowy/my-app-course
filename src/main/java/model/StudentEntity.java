package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class StudentEntity extends PersonEntity{

    @OneToMany(mappedBy = "student")
    private Set<CourseAssignmentEntity> courseAssignmentSet;
}
