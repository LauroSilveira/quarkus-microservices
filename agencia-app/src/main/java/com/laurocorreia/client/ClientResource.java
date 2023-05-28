package com.laurocorreia.client;

import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/client")
public class ClientResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Client> getClients() {
    return Client.listAll();
  }

  @GET
  @Transactional
  @Path("findById")
  @Produces(MediaType.APPLICATION_JSON)
  public Client findById(@QueryParam("id") final long id) {
    return Client.findById(id);
  }

  @DELETE
  @Path("deleteById")
  public void deleteById(long id) {
    Client.deleteById(id);
  }

  @POST
  @Transactional
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response createClient(Client client) {
    client.id = null;
    client.persist();;
    return Response.status(Response.Status.CREATED).entity(client).build();
  }
}