package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import modelsEntities.Specialist;
import repositories.SpecialistRepository;

import java.util.List;

@Path("/especialistas")
public class SpecialistResource {

    @Inject
    private SpecialistRepository repoSpecialist;

    @GET
    public List<Specialist> getAll() {
        return repoSpecialist.listAll();
    }
}
