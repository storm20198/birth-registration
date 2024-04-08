package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * minimal representation of the Roles in the system to be carried along in UserInfo with RequestInfo meta data. Actual authorization service to extend this to have more role related attributes
 */
@Schema(description = "minimal representation of the Roles in the system to be carried along in UserInfo with RequestInfo meta data. Actual authorization service to extend this to have more role related attributes ")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-04-04T07:08:25.591486Z[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    @JsonProperty("tenantId")
    @NotNull

    private String tenantId = null;

    @JsonProperty("id")

    private String id = null;

    @JsonProperty("name")

    @Size(max = 64)
    private String name = null;

    @JsonProperty("description")

    private String description = null;
    @JsonProperty("code")

    private String code = null;


}
