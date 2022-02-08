package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;

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
import io.swagger.model.Portal;
import io.swagger.model.User;

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
@Path("/user")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class UserApi  {

    @Inject UserApiService service;

    @GET
    @Path("/{uuid}/avatars")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve avatars for user", description = "Retrieve all avatar info for the given user", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "user", "avatar" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Avatar.class)))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response userUuidAvatarsGet( @PathParam("uuid") String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userUuidAvatarsGet(uuid,securityContext);
    }
    @GET
    @Path("/{uuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve user info", description = "Retrieve explicit information for user", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))) })
    public Response userUuidGet( @PathParam("uuid") String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userUuidGet(uuid,securityContext);
    }
    @GET
    @Path("/{uuid}/portals")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve portals for user", description = "Retrieve all portal info for the given user", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "user", "portal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Portal.class)))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response userUuidPortalsGet( @PathParam("uuid") String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userUuidPortalsGet(uuid,securityContext);
    }
    @GET
    @Path("/{uuid}/ugt")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve ugts for user", description = "Retrieve a list of ugts for the described user", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "user", "ugt" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response userUuidUgtGet( @PathParam("uuid") String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userUuidUgtGet(uuid,securityContext);
    }
}
