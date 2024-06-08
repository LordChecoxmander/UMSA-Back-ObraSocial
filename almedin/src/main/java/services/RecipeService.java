package services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import modelsEntities.Recipe;
import repositories.RecipeRepository;

@ApplicationScoped
public class RecipeService {

    @Inject
    RecipeRepository recipeRepository;

    public Recipe obtenerRecetaPorTurno(Long turnoId) {
        Recipe receta = recipeRepository.find("shift.id", turnoId).firstResult();
        if (receta == null || !receta.isActive()) {
            throw new RuntimeException("Receta no válida o no encontrada");
        }
        return receta;
    }
}
