package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Portal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public interface PortalApiService {
      Response portalUidGet(String uid,SecurityContext securityContext)
      throws NotFoundException;
}
