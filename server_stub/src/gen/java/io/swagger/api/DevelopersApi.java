package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DevelopersApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Portal;
import io.swagger.model.SessionInfo;
import io.swagger.model.SessionsUuidBody;
import io.swagger.model.UuidUgtBody;

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
@Path("/developers")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class DevelopersApi  {

    @Inject DevelopersApiService service;

    @DELETE
    @Path("/{developerKey}/{appKey}/sessions/{uuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "End a Session", description = "End an active session for an user.", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "session", "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Delete", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed Delete", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeySessionsUuidDelete( @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @NotNull  @QueryParam("sessionKey") String sessionKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeySessionsUuidDelete(uuid,developerKey,sessionKey,appKey,securityContext);
    }
    @PATCH
    @Path("/{developerKey}/{appKey}/sessions/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Pause Or Resume Session", description = "Pause or Resume a session without ending the session", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "session", "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Update", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed Update", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeySessionsUuidPatch(@Parameter(description = "Has relevant session info for update." ,required=true) SessionsUuidBody body, @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeySessionsUuidPatch(body,uuid,developerKey,appKey,securityContext);
    }
    @POST
    @Path("/{developerKey}/{appKey}/sessions/{uuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Start a Session", description = "Start a Session for the user", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "session", "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Create", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed Create", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeySessionsUuidPost( @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeySessionsUuidPost(uuid,developerKey,appKey,securityContext);
    }
    @PUT
    @Path("/{developerKey}/{appKey}/sessions/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Keep-Alive a Session", description = "Keep an active session for an user alive", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "session", "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Update", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed Update", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeySessionsUuidPut(@Parameter(description = "Has relevant session info for update." ,required=true) SessionInfo body, @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeySessionsUuidPut(body,uuid,developerKey,appKey,securityContext);
    }
    @GET
    @Path("/{developerKey}/{appKey}/ugt")
    
    @Produces({ "application/json" })
    @Operation(summary = "Retrieve ugts for given user ids.", description = "Retrieve all UGTs for a set of supplied user ids.", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "ugt" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Portal.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeyUgtGet( @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey, @NotNull  @QueryParam("uuids") List<String> uuids,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeyUgtGet(developerKey,appKey,uuids,securityContext);
    }
    @GET
    @Path("/{developerKey}/{appKey}/{uuid}/ugt")
    
    @Produces({ "application/json" })
    @Operation(summary = "Fetch UGT for user.", description = "Get the UGT set by user for the given developer-app key pair.", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "ugt" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed fetch", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeyUuidUgtGet( @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeyUuidUgtGet(uuid,developerKey,appKey,securityContext);
    }
    @POST
    @Path("/{developerKey}/{appKey}/{uuid}/ugt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Set UGT for user.", description = "Set the UGT for given user and the developer-app key pair.", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write"
        })
    }, tags={ "developer", "ugt" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful set", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Failed set", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response developersDeveloperKeyAppKeyUuidUgtPost(@Parameter(description = "Contains the (valid) ugt to set for the given user/app pair." ,required=true) UuidUgtBody body, @PathParam("uuid") String uuid, @PathParam("developerKey") String developerKey, @PathParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.developersDeveloperKeyAppKeyUuidUgtPost(body,uuid,developerKey,appKey,securityContext);
    }
}
