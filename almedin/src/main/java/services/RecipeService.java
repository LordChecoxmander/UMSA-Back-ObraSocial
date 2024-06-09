package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import modelsEntities.Recipe;
import services.RecipeService;
import utils.PdfGenerator;

@Path("/recipes")
public class RecipeResource {

    @Inject
    private RecipeService recipeService;

    @GET
    @Path("{id}")
    @Produces("application/pdf")
    public Response downloadRecipe(@PathParam("id") Long shiftId) {
        Recipe recipe = recipeService.getRecipeByShiftId(shiftId);
        byte[] pdfData = PdfGenerator.generatePdf(recipe);

        return Response.ok(pdfData)
                .header("Content-Disposition", "attachment; filename=recipe_" + shiftId + ".pdf")
                .build();
    }
}
