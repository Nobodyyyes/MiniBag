package kg.megalab.demo.dal.entity;


import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import kg.megalab.demo.dal.dto.IdeaDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "ideas")
public class IdeaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String text;

    @Timestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    public IdeaEntity(IdeaDto idea){
        this.id = idea.getId();
        this.text = idea.getText();
        this.createdAt = LocalDateTime.now();
        this.user = new UserEntity(idea.getUserId().getId());
    }

}
