package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import modelsEntities.User;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}
