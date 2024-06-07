package resources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import modelsEntities.Shift;
import repositories.ShiftRepository;

@Path("/Turnos")
public class ShiftResource {

    @Inject
    private ShiftRepository repoShift;

    //Crea un tunro
    @POST
    @Transactional
    public void createShift(Shift insertedShift){

    }

    //Modifica el turno
    //NO le den bola al codigo, esta incompleto le meti algo pa que no llogre el editor
    @PUT
    @Path("{id}")
    @Transactional
    public Shift updateShift(@PathParam("id") Long id, Shift updatedShift){
        Shift upShift = repoShift.findById(id);
        if(upShift != null){
            upShift.setId(id);
        }
        return upShift;
    }

    //Elimina el turno
    @DELETE
    @Path("{id}")
    @Transactional
    public void deleteShift(@PathParam("id") Long id){

    }

}
