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
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateShift(@PathParam("id") Long id, RequestShiftDTO updatedShift){

        shiftService.updateShift(updatedShift, id);
        return Response.ok(200).build();
    }

    // New method to delete a shift
    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteShift(@PathParam("id") Long id) {
        try {
            shiftService.deleteShift(id);
            return Response.noContent().build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }

}
