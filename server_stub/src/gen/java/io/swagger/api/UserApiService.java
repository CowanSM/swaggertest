package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Avatar;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Portal;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public interface UserApiService {
      Response userUuidAvatarsGet(String uuid,SecurityContext securityContext)
      throws NotFoundException;
      Response userUuidGet(String uuid,SecurityContext securityContext)
      throws NotFoundException;
      Response userUuidPortalsGet(String uuid,SecurityContext securityContext)
      throws NotFoundException;
      Response userUuidUgtGet(String uuid,SecurityContext securityContext)
      throws NotFoundException;
}
