package sda.homework.myapphomework.model;

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
@Table(name = "applicationUser")
public class ApplicationUser extends PersonEntity{

    @OneToMany(mappedBy = "applicationUser")
    private Set<CourseAssignmentEntity> courseAssignmentSet;

}
