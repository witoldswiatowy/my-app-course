package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "instructor")
public class InstructorEntity extends PersonEntity{

    @OneToMany(mappedBy = "instructor")
    private Set<CourseAssignmentEntity> courseAssignmentSet;

}
