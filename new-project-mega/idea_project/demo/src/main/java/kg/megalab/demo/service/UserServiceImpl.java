package kg.megalab.demo.service;


import kg.megalab.demo.dal.dto.IdeaDto;
import kg.megalab.demo.dal.dto.UserDto;
import kg.megalab.demo.dal.dto.UserSaveDto;
import kg.megalab.demo.dal.entity.IdeaEntity;
import kg.megalab.demo.dal.entity.UserEntity;
import kg.megalab.demo.dal.repository.IdeaRepository;
import kg.megalab.demo.dal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepository userRepository;
    private final IdeaRepository ideaRepository;

    public void saveUser(UserSaveDto user) {
        UserEntity entity = new UserEntity(user);
        userRepository.save(entity);
    }


    public List<UserDto> getAllUsers() {
        List<UserEntity> user = (List<UserEntity>)userRepository.findAll();
        return user.stream().map(UserDto::new)
                .collect(Collectors.toList());
    }



//    @Override
//    public void changeUser(UserChangeDto dto) {
//        Optional<UserEntity> user = userRepository.findById(dto.getId());
//        if(user.isPresent()){
//            UserEntity entity = user.get();
//            entity.setLogin(dto.getLogin());
//            entity.setEmail(dto.getEmail());
//            entity.setFirstname(dto.getFirstname());
//            entity.setLastname(dto.getLastname());
//            entity.setBirthDt(dto.getBirthDt());
//        }
//    }


}
