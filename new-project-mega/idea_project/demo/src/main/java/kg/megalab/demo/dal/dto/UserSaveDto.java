package kg.megalab.demo.dal.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.demo.dal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSaveDto {

    private String login;
    private String email;
    private String firstname;
    private String lastname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate birthDt;


    public UserSaveDto(UserEntity user){
        this.login = user.getLogin();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.birthDt = user.getBirthDt();
    }
}
