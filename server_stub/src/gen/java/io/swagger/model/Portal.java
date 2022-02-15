package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PortalElements;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class Portal   {
  private String uid = null;  private String model = null;  private String skin = null;  private PortalElements elements = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("uid")
  @NotNull
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("skin")
  public String getSkin() {
    return skin;
  }
  public void setSkin(String skin) {
    this.skin = skin;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("elements")
  public PortalElements getElements() {
    return elements;
  }
  public void setElements(PortalElements elements) {
    this.elements = elements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portal portal = (Portal) o;
    return Objects.equals(uid, portal.uid) &&
        Objects.equals(model, portal.model) &&
        Objects.equals(skin, portal.skin) &&
        Objects.equals(elements, portal.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, model, skin, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portal {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    skin: ").append(toIndentedString(skin)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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
