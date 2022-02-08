package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PingApiService;

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
@Path("/ping")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class PingApi  {

    @Inject PingApiService service;

    @GET
    
    
    
    @Operation(summary = "Server heartbeat operation", description = "This operation shows how to override the global security defined above, as we want to open it up for all users.", tags={ "dev" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK") })
    public Response pingGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pingGet(securityContext);
    }
}
