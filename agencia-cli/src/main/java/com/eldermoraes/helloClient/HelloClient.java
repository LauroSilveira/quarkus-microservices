package com.eldermoraes.helloClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello CLIENT";
    }
}
