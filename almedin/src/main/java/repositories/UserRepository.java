package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import modelsEntities.User;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    public User findByName(String name) {
        return find("name", name).firstResult();
    }
}
