package services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import modelsEntities.Recipe;
import repositories.RecipeRepository;

@ApplicationScoped
public class RecipeService {

    @Inject
    private RecipeRepository recipeRepository;

    public Recipe getRecipeByShiftId(Long shiftId) {
        return recipeRepository.findById(shiftId);
    }
}
