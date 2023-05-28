package com.eldermoraes.helloClient;

import com.eldermoraes.client.Client;
import com.eldermoraes.reserv.ReservService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/reserv-cli")
public class ReservResource {

    @Inject
    @RestClient
    ReservService reservService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("createReserv")
    public String createReserv() {
        Client client = Client.of(2, "");
        return reservService.createReserv(client);
    }
}

