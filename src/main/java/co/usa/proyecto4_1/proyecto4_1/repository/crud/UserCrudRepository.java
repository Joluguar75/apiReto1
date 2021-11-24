package co.usa.proyecto4_1.proyecto4_1.repository.crud;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import co.usa.proyecto4_1.proyecto4_1.model.User;
/**
 *
 * @author Joluguar
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
