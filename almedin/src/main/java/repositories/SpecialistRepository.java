package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import modelsEntities.Specialist;

@ApplicationScoped
public class SpecialistRepository implements PanacheRepository<Specialist> {
}
