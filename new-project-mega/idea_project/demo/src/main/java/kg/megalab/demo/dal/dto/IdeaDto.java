package kg.megalab.demo.dal.dto;

import kg.megalab.demo.dal.entity.IdeaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdeaDto {

    private Long id;

    private String text;

    private UserIdDto userId;

    public IdeaDto(IdeaEntity entity){
        this.id = entity.getId();
        this.text = entity.getText();
        this.userId = new UserIdDto(entity.getId());
    }
}
