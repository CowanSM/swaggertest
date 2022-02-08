package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Portal;
import io.swagger.model.SessionInfo;
import io.swagger.model.SessionsUuidBody;
import io.swagger.model.UuidUgtBody;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public interface DevelopersApiService {
      Response developersDeveloperKeyAppKeySessionsUuidDelete(String uuid,String developerKey,String sessionKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeySessionsUuidPatch(SessionsUuidBody body,String uuid,String developerKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeySessionsUuidPost(String uuid,String developerKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeySessionsUuidPut(SessionInfo body,String uuid,String developerKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeyUgtGet(String developerKey,String appKey,List<String> uuids,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeyUuidUgtGet(String uuid,String developerKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response developersDeveloperKeyAppKeyUuidUgtPost(UuidUgtBody body,String uuid,String developerKey,String appKey,SecurityContext securityContext)
      throws NotFoundException;
}
