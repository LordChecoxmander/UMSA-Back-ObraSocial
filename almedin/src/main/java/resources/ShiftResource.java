package resources;

import io.swagger.annotations.ApiParam;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import modelsDTO.RequestShiftDTO;
import modelsEntities.Shift;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
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
    @Operation(summary = "create a shift", description = "Crea un turno con los datos ingresados")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "shitf created")
    })
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
    @Operation(summary = "update a shift", description = "Actualiza el turno del id ingresado con los datos asociados")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "shitf updated")
    })
    public Response updateShift(@ApiParam(value="id del turno", name=" id", example="2", required=true) @PathParam("id") Long id,
                                @ApiParam(value="valores a actualizar", name="turno actualizado", required = true) RequestShiftDTO updatedShift){

        shiftService.updateShift(updatedShift, id);
        return Response.ok(200).build();
    }

    // New method to delete a shift
    @DELETE
    @Path("{id}")
    @Transactional
    @Operation(summary = "delete a shift", description = "Elimina el turno con el id ingresado")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "shitf deleted")
    })
    public Response deleteShift(@ApiParam(value="id del turno", name=" id", example="2", required=true) @PathParam("id") Long id) {
        try {
            shiftService.deleteShift(id);
            return Response.noContent().build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }

}
}
