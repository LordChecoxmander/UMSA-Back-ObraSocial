package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import modelsEntities.Recipe;
import repositories.RecipeRepository;

@Path("/recetas")
public class RecipeResource {

    @Inject
    private RecipeRepository repoRecipe;

    //Retorna la receta con el id solicitado
    @GET
    @Path("{id}")
    public Recipe getRecipe(@PathParam("id") Long id) {
        return repoRecipe.findById(id);
    }

}
