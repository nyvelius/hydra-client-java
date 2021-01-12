/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.0-rc.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * OpenIDConnectContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-12T14:40:29.299715Z[GMT]")
public class OpenIDConnectContext {
  public static final String SERIALIZED_NAME_ACR_VALUES = "acr_values";
  @SerializedName(SERIALIZED_NAME_ACR_VALUES)
  private List<String> acrValues = null;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_ID_TOKEN_HINT_CLAIMS = "id_token_hint_claims";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_HINT_CLAIMS)
  private Object idTokenHintClaims;

  public static final String SERIALIZED_NAME_LOGIN_HINT = "login_hint";
  @SerializedName(SERIALIZED_NAME_LOGIN_HINT)
  private String loginHint;

  public static final String SERIALIZED_NAME_UI_LOCALES = "ui_locales";
  @SerializedName(SERIALIZED_NAME_UI_LOCALES)
  private List<String> uiLocales = null;


  public OpenIDConnectContext acrValues(List<String> acrValues) {
    
    this.acrValues = acrValues;
    return this;
  }

  public OpenIDConnectContext addAcrValuesItem(String acrValuesItem) {
    if (this.acrValues == null) {
      this.acrValues = new ArrayList<String>();
    }
    this.acrValues.add(acrValuesItem);
    return this;
  }

   /**
   * ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: &gt; Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.
   * @return acrValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.")

  public List<String> getAcrValues() {
    return acrValues;
  }


  public void setAcrValues(List<String> acrValues) {
    this.acrValues = acrValues;
  }


  public OpenIDConnectContext display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \&quot;feature phone\&quot; type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \"feature phone\" type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.")

  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }


  public OpenIDConnectContext idTokenHintClaims(Object idTokenHintClaims) {
    
    this.idTokenHintClaims = idTokenHintClaims;
    return this;
  }

   /**
   * IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User&#39;s current or past authenticated session with the Client.
   * @return idTokenHintClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User's current or past authenticated session with the Client.")

  public Object getIdTokenHintClaims() {
    return idTokenHintClaims;
  }


  public void setIdTokenHintClaims(Object idTokenHintClaims) {
    this.idTokenHintClaims = idTokenHintClaims;
  }


  public OpenIDConnectContext loginHint(String loginHint) {
    
    this.loginHint = loginHint;
    return this;
  }

   /**
   * LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.
   * @return loginHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.")

  public String getLoginHint() {
    return loginHint;
  }


  public void setLoginHint(String loginHint) {
    this.loginHint = loginHint;
  }


  public OpenIDConnectContext uiLocales(List<String> uiLocales) {
    
    this.uiLocales = uiLocales;
    return this;
  }

  public OpenIDConnectContext addUiLocalesItem(String uiLocalesItem) {
    if (this.uiLocales == null) {
      this.uiLocales = new ArrayList<String>();
    }
    this.uiLocales.add(uiLocalesItem);
    return this;
  }

   /**
   * UILocales is the End-User&#39;id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \&quot;fr-CA fr en\&quot; represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.
   * @return uiLocales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \"fr-CA fr en\" represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.")

  public List<String> getUiLocales() {
    return uiLocales;
  }


  public void setUiLocales(List<String> uiLocales) {
    this.uiLocales = uiLocales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIDConnectContext openIDConnectContext = (OpenIDConnectContext) o;
    return Objects.equals(this.acrValues, openIDConnectContext.acrValues) &&
        Objects.equals(this.display, openIDConnectContext.display) &&
        Objects.equals(this.idTokenHintClaims, openIDConnectContext.idTokenHintClaims) &&
        Objects.equals(this.loginHint, openIDConnectContext.loginHint) &&
        Objects.equals(this.uiLocales, openIDConnectContext.uiLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acrValues, display, idTokenHintClaims, loginHint, uiLocales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIDConnectContext {\n");
    sb.append("    acrValues: ").append(toIndentedString(acrValues)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    idTokenHintClaims: ").append(toIndentedString(idTokenHintClaims)).append("\n");
    sb.append("    loginHint: ").append(toIndentedString(loginHint)).append("\n");
    sb.append("    uiLocales: ").append(toIndentedString(uiLocales)).append("\n");
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

