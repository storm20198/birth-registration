package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Representation of a address. Indiavidual APIs may choose to extend from this using allOf if more details needed to be added in their case.
 */
@Schema(description = "Representation of a address. Indiavidual APIs may choose to extend from this using allOf if more details needed to be added in their case. ")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-04-04T07:08:25.591486Z[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    @JsonProperty("tenantId")

    private String tenantId = null;

    @JsonProperty("latitude")

    private Double latitude = null;

    @JsonProperty("longitude")

    private Double longitude = null;

    @JsonProperty("addressId")

    private String addressId = null;

    @JsonProperty("addressNumber")

    private String addressNumber = null;

    @JsonProperty("addressLine1")

    private String addressLine1 = null;

    @JsonProperty("addressLine2")

    private String addressLine2 = null;

    @JsonProperty("landmark")

    private String landmark = null;

    @JsonProperty("city")

    private String city = null;

    @JsonProperty("pincode")

    private String pincode = null;

    @JsonProperty("detail")

    private String detail = null;

    @JsonProperty("id")

    private String id = null;

    @JsonProperty("doorNo")

    private String doorNo = null;

    @JsonProperty("buildingName")

    private String buildingName = null;

    @JsonProperty("type")

    private String type = null;

    @JsonProperty("street")

    private String street = null;

    @JsonProperty("registrationId")
    private String registrationId = null;
}
