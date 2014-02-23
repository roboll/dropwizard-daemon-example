package com.robertcboll.dropwizard.daemon.example.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * A resource that sends a no-content response (HTTP 204).
 *
 */
@Path("/")
public class EmptyResource {

    @GET
    public Response empty() {
        return Response.noContent().build();
    }
}
