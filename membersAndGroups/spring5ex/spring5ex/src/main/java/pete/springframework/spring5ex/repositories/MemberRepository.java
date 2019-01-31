package pete.springframework.spring5ex.repositories;

import org.springframework.data.repository.CrudRepository;
import pete.springframework.spring5ex.Model.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
