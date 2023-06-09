package kg.megalab.demo.controller;

import kg.megalab.demo.dal.dto.UserSaveDto;
import kg.megalab.demo.service.IdeaServiceImpl;
import kg.megalab.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final IdeaServiceImpl ideaService;

    @PostMapping
    public ResponseEntity<?> saveUsers(@RequestBody UserSaveDto body){
        userService.saveUser(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK );
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser(@RequestParam ("userId") Long userId){
        userService.deleteAllIdeas(userId);
        userService.deleteUser(userId, );
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> changeUsers(@PathVariable Long id, @RequestBody UserChangeDto userChangeDto){
//        userService.changeUser(userChangeDto);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
