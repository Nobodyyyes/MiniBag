package kg.megalab.demo.service;

import kg.megalab.demo.dal.dto.IdeaDto;
import kg.megalab.demo.dal.entity.IdeaEntity;
import kg.megalab.demo.dal.repository.IdeaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class IdeaServiceImpl {
    private final IdeaRepository ideaRepository;



    public void saveIdea(IdeaDto idea) {
        IdeaEntity entity = new IdeaEntity(idea);
        ideaRepository.save(entity);
    }


    public List<IdeaDto> getAllIdeas() {
        List<IdeaEntity> idea = (List<IdeaEntity>) ideaRepository.findAll();
        return idea.stream().map(IdeaDto::new).collect(Collectors.toList());
    }


    public void deleteAllUserIdea(Long userId) {
        Optional<IdeaEntity> idea = ideaRepository.findById(userId);
        if (idea.isEmpty()){
            throw new RuntimeException("no.idea");
        }
        ideaRepository.deleteAll();
    }

    public void deleteIdea(Long ideaId){
        ideaRepository.deleteById(ideaId);
    }
}