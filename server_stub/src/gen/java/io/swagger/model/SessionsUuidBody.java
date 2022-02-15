package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SessionInfo;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class SessionsUuidBody   {
  private SessionInfo sessionInfo = null;  private Boolean setPause = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("sessionInfo")
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }
  public void setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("setPause")
  public Boolean isSetPause() {
    return setPause;
  }
  public void setSetPause(Boolean setPause) {
    this.setPause = setPause;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionsUuidBody sessionsUuidBody = (SessionsUuidBody) o;
    return Objects.equals(sessionInfo, sessionsUuidBody.sessionInfo) &&
        Objects.equals(setPause, sessionsUuidBody.setPause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionInfo, setPause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionsUuidBody {\n");
    
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    setPause: ").append(toIndentedString(setPause)).append("\n");
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
