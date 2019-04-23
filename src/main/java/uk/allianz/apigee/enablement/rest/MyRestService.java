package uk.allianz.apigee.enablement.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class MyRestService {
    @GET // This annotation indicates GET request
    @Path("/health")
    @Produces("application/json")
    public Response health() {

        HealthCheckResponse res = new HealthCheckResponse();

        res.setServiceStatus(HealthCheckResponse.PASS);
        res.setVersion("1");
        res.setReleaseId("12345");
        res.setDescription("UK Allianz Apigee Enablement Component");

        return Response.status(201).entity(res).build();
    }

    @GET // This annotation indicates GET request
    @Path("/hello")
    @Produces("application/json")
    public Response hello() {

        return Response.status(200).entity("{'message' = 'hello'}").build();
    }
}