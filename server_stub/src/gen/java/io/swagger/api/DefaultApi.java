package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DefaultApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class DefaultApi  {

    @Inject DefaultApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Server example operation", description = "This is an example operation to show how security is applied to the call.", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "dev" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response rootGet( @NotNull  @QueryParam("testq") String testq,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.rootGet(testq,securityContext);
    }
}
