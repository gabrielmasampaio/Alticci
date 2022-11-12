package org.acme.resource;

import org.acme.entity.Alticci;
import org.acme.service.AlticciService;
import org.jboss.resteasy.reactive.ResponseHeader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Objects;

@Path("/alticci")
public class AlticciResource {

    private AlticciService alticciService = new AlticciService();

    @GET
    @Path("/{n}")
    public Response getAlticci(@PathParam("n") Integer n) {
        if(Objects.isNull(n)){
            return Response.status(Response.Status.BAD_REQUEST).entity("N is required").header("Access-Control-Allow-Origin", "*").build();
        }

        try {
            Alticci alticci = alticciService.getAlticci(n);
            String body = "  { " +
                            "\"value\": " + alticci.getValue() + "," +
                            "\"position\": " + alticci.getPosition() +
                            "}";
            return Response.ok(body, MediaType.APPLICATION_JSON).header("Access-Control-Allow-Origin", "*").build();
        } catch(Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).header("Access-Control-Allow-Origin", "*").build();
        }
    }
}
