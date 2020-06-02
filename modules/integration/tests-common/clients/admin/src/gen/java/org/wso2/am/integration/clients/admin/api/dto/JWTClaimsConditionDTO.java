/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleConditionDTO;

/**
 * JWTClaimsConditionDTO
 */

public class JWTClaimsConditionDTO extends ThrottleConditionDTO {
  @SerializedName("claimUrl")
  private String claimUrl = null;

  @SerializedName("attribute")
  private String attribute = null;

  public JWTClaimsConditionDTO claimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
    return this;
  }

   /**
   * JWT claim URL
   * @return claimUrl
  **/
  @ApiModelProperty(value = "JWT claim URL")
  public String getClaimUrl() {
    return claimUrl;
  }

  public void setClaimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
  }

  public JWTClaimsConditionDTO attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Attribute to be matched
   * @return attribute
  **/
  @ApiModelProperty(value = "Attribute to be matched")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTClaimsConditionDTO jwTClaimsCondition = (JWTClaimsConditionDTO) o;
    return Objects.equals(this.claimUrl, jwTClaimsCondition.claimUrl) &&
        Objects.equals(this.attribute, jwTClaimsCondition.attribute) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimUrl, attribute, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTClaimsConditionDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    claimUrl: ").append(toIndentedString(claimUrl)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
