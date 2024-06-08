package resources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import modelsDTO.RequestShiftDTO;
import modelsEntities.Shift;
import repositories.ShiftRepository;
import services.ShiftService;

@Path("/Turnos")
public class ShiftResource {

    @Inject
    private ShiftRepository repoShift;
    private ShiftService shiftService;

    //Crea un tunro
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createShift(RequestShiftDTO shiftdto){
        shiftService.createShift(shiftdto);

        //REVISAR ESTE RESPONSE
        return Response.ok(200).build();
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
