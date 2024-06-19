package resources;

import io.swagger.annotations.ApiParam;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import modelsEntities.Recipe;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import repositories.RecipeRepository;

@Path("/recetas")
public class RecipeResource {

    @Inject
    private RecipeRepository repoRecipe;

    @GET
    @Path("{id}")
    @Operation(summary = "get a recipe", description = "Retorna la receta asociada al id ingresado")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "get recipe")
    })
    public Recipe getRecipe(@ApiParam(value="id de la receta", name=" id", example="2", required=true) @PathParam("id") Long id) {
        return repoRecipe.findById(id);
    }
}