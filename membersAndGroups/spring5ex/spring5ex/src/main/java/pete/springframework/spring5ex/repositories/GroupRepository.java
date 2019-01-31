package pete.springframework.spring5ex.repositories;

import org.springframework.data.repository.CrudRepository;
import pete.springframework.spring5ex.Model.Group;

public interface GroupRepository extends CrudRepository<Group, Long> {
}
