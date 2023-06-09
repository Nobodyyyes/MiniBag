package kg.megalab.demo.dal.repository;

import kg.megalab.demo.dal.entity.IdeaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IdeaRepository extends CrudRepository<IdeaEntity, Long> {
}
