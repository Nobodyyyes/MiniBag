package kg.megalab.demo.dal.model;

import jakarta.persistence.*;
import kg.megalab.demo.dal.dto.StudentDto;
import lombok.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String login;
    private Long number;

    public StudentModel(StudentDto student) {
        this.Id = student.getId();
        this.login = student.getLogin();
        this.number = student.getId();
    }

}
