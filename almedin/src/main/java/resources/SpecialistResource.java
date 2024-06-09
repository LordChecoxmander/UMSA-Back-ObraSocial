package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import modelsDTO.ResponseSpecialistDTO;
import modelsEntities.Specialist;
import repositories.SpecialistRepository;
import services.SpecialistService;

import java.util.List;

@Path("/especialistas")
public class SpecialistResource {

    @Inject
    private SpecialistService specialistService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllSpecialist() {
        return Response.ok(specialistService.getAllSpecialists()).build();
    }
}
