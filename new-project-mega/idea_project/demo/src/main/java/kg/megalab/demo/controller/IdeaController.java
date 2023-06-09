package kg.megalab.demo.controller;

import kg.megalab.demo.dal.dto.IdeaDto;
import kg.megalab.demo.service.IdeaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/idea")
public class IdeaController {
    private final IdeaServiceImpl ideaService;

    @PostMapping
    public ResponseEntity<?> saveIdeas(@RequestBody IdeaDto idea){
        ideaService.saveIdea(idea);
        return new ResponseEntity<>(HttpStatus.OK);
    }

        @GetMapping
        public ResponseEntity<?> getAllIdeas(){
            return new ResponseEntity<>(ideaService.getAllIdeas(), HttpStatus.OK);
    }


    @DeleteMapping
    public ResponseEntity<?> deleteIdea(@RequestParam("id") Long id){
        ideaService.deleteIdea(id);
    }
}
//где потст пут бади
//где берем там просто параметры