package com.eldermoraes.client;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/client-cli")
public class ClientResource {

    @Inject
    @RestClient
    ClientService clientService;

    @GET
    @Path("createClient")
    public Response createClient() {
        final Client client = Client.of(9, "Remoto");
        Response response = clientService.createClient(client);
        return Response.status(Response.Status.CREATED).entity(response).build();
    }
}
