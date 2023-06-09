package kg.megalab.demo.dal.entity;

import jakarta.persistence.*;
import kg.megalab.demo.dal.dto.UserSaveDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String email;
    private String firstname;
    private String lastname;
    @CreationTimestamp
    @Column(name = "created_dt", nullable = false)
    private LocalDateTime createdDt;
    @Column(name = "birth_name")
    private LocalDate birthDt;

    @OneToMany(mappedBy = "user")
    List<IdeaEntity> ideas;

    public UserEntity(UserSaveDto dto){
        this.login = dto.getLogin();
        this.email = dto.getEmail();
        this.firstname = dto.getFirstname();
        this.lastname = dto.getLastname();
    }

    public UserEntity(Long id) {
        this.id = id;
    }
}
