package kg.megalab.demo.service;

import kg.megalab.demo.dal.dto.UserDto;
import kg.megalab.demo.dal.dto.UserSaveDto;
import kg.megalab.demo.dal.entity.IdeaEntity;

import java.util.List;

public interface UserService {
    void saveUser(UserSaveDto user);

    List<UserDto> getAllUsers();

    void deleteAllIdeas(Long idea);

    void deleteUser(Long userId, IdeaEntity idea);
}
