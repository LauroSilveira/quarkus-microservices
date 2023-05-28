package com.laurocorreia.reserv;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/reserv")
public class ReservResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserv> getAll() {
        return Reserv.listAll();
    }
    
    
    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createReserve(Reserv reserv) {
        reserv.id = null;
        reserv.persist();
        return Response.accepted().entity(reserv).build();
    }
}
