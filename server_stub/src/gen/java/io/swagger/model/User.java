package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Avatar;
import io.swagger.model.Portal;
import io.swagger.model.Ugt;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class User   {
  private String uuid = null;  private List<Avatar> avatars = new ArrayList<Avatar>();  private List<Portal> portals = new ArrayList<Portal>();  private List<Ugt> ugt = new ArrayList<Ugt>();

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("uuid")
  @NotNull
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("avatars")
  public List<Avatar> getAvatars() {
    return avatars;
  }
  public void setAvatars(List<Avatar> avatars) {
    this.avatars = avatars;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("portals")
  public List<Portal> getPortals() {
    return portals;
  }
  public void setPortals(List<Portal> portals) {
    this.portals = portals;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ugt")
  public List<Ugt> getUgt() {
    return ugt;
  }
  public void setUgt(List<Ugt> ugt) {
    this.ugt = ugt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(uuid, user.uuid) &&
        Objects.equals(avatars, user.avatars) &&
        Objects.equals(portals, user.portals) &&
        Objects.equals(ugt, user.ugt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, avatars, portals, ugt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    avatars: ").append(toIndentedString(avatars)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    ugt: ").append(toIndentedString(ugt)).append("\n");
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
