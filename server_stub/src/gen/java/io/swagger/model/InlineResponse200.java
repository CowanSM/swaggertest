package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.SessionInfo;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class InlineResponse200   {
  private ModelApiResponse response = null;  private SessionInfo session = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("response")
  public ModelApiResponse getResponse() {
    return response;
  }
  public void setResponse(ModelApiResponse response) {
    this.response = response;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("session")
  public SessionInfo getSession() {
    return session;
  }
  public void setSession(SessionInfo session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(response, inlineResponse200.response) &&
        Objects.equals(session, inlineResponse200.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
