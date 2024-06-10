package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import modelsEntities.UserRole;

@ApplicationScoped
public class UserRoleRepository implements PanacheRepository<UserRole> {
}
