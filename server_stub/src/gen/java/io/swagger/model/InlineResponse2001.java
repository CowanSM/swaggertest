package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Ugt;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-02-08T22:42:56.762Z[GMT]")public class InlineResponse2001   {
  private ModelApiResponse _apiResponse = null;  private Ugt ugt = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("apiResponse")
  public ModelApiResponse getApiResponse() {
    return _apiResponse;
  }
  public void setApiResponse(ModelApiResponse _apiResponse) {
    this._apiResponse = _apiResponse;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ugt")
  public Ugt getUgt() {
    return ugt;
  }
  public void setUgt(Ugt ugt) {
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
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(_apiResponse, inlineResponse2001._apiResponse) &&
        Objects.equals(ugt, inlineResponse2001.ugt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_apiResponse, ugt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    _apiResponse: ").append(toIndentedString(_apiResponse)).append("\n");
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
