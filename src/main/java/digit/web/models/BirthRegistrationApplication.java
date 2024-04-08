package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A Object holds the basic data for a Birth Registration Application
 */
@Schema(description = "A Object holds the basic data for a Birth Registration Application")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-04-04T07:08:25.591486Z[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BirthRegistrationApplication {
    @JsonProperty("id")

    @Size(min = 2, max = 64)
    private String id = null;

    @JsonProperty("tenantId")
    @NotNull

    @Size(min = 2, max = 128)
    private String tenantId = null;

    @JsonProperty("applicationNumber")

    @Size(min = 2, max = 128)
    private String applicationNumber = null;

    @JsonProperty("babyFirstName")
    @NotNull

    @Size(min = 2, max = 128)
    private String babyFirstName = null;

    @JsonProperty("babyLastName")

    @Size(min = 2, max = 128)
    private String babyLastName = null;

    @JsonProperty("fatherOfApplicant")
    @NotNull

    @Valid
    private User father = null;

    @JsonProperty("motherOfApplicant")
    @NotNull

    @Valid
    private User mother = null;

    @JsonProperty("doctorName")
    @NotNull

    @Size(min = 2, max = 128)
    private String doctorName = null;

    @JsonProperty("hospitalName")
    @NotNull

    @Size(min = 2, max = 128)
    private String hospitalName = null;

    @JsonProperty("placeOfBirth")
    @NotNull

    @Size(min = 2, max = 128)
    private String placeOfBirth = null;

    @JsonProperty("timeOfBirth")

    private Integer timeOfBirth = null;

    @JsonProperty("address")

    @Valid
    private BirthApplicationAddress address = null;

    @JsonProperty("workflow")

    @Valid
    private Workflow workflow = null;

    @JsonProperty("auditDetails")

    @Valid
    private AuditDetails auditDetails = null;


}
