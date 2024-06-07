package repositories;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import modelsEntities.Recipe;

@ApplicationScoped
public class RecipeRepository implements PanacheRepository<Recipe> {
}
