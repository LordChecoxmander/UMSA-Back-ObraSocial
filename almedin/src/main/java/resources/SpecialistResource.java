package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import modelsDTO.ResponseSpecialistDTO;
import modelsEntities.Specialist;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import repositories.SpecialistRepository;
import services.SpecialistService;

import java.util.List;

@Path("/especialistas")
public class SpecialistResource {

    @Inject
    private SpecialistService specialistService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "get all specialist", description = "Retorna todos los especialistas " +
            "disponibles en el sistema")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "get all specialist")
    })
    public Response getAllSpecialist() {
        return Response.ok(specialistService.getAllSpecialists()).build();
    }
}
