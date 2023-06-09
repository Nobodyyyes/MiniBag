package kg.megalab.demo.dal.dto;

import kg.megalab.demo.dal.model.StudentModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String login;

    public StudentDto(StudentModel model) {
        this.id = model.getId();
        this.login = model.getLogin();
    }
}
