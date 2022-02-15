package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AvatarApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Avatar;
import io.swagger.model.ModelApiResponse;

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
@Path("/avatar")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class AvatarApi  {

    @Inject AvatarApiService service;

    @GET
    @Path("/{uid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve avatar information", description = "Retrieve avatar info for given id", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "avatar" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Avatar.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response avatarUidGet( @PathParam("uid") String uid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.avatarUidGet(uid,securityContext);
    }
}
