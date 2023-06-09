package kg.megalab.demo.dal.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.demo.dal.entity.IdeaEntity;
import kg.megalab.demo.dal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String login;
    private String email;
    private String firstname;
    private String lastname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd hh:mm:ss")
    private LocalDateTime createdDt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate birthDt;
    private List<IdeaDto> ideas;


    public UserDto(UserEntity user){
        this.login = user.getLogin();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.createdDt = LocalDateTime.now();
        this.birthDt = user.getBirthDt();
        this.ideas = user.getIdeas().stream()
                .map(IdeaDto::new)
                .collect(Collectors.toList());
    }


}
