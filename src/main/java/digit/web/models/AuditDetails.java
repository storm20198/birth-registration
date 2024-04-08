package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Collection of audit related fields used by most models
 */
@Schema(description = "Collection of audit related fields used by most models")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-04-04T07:08:25.591486Z[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditDetails {
    @JsonProperty("createdBy")

    private String createdBy = null;

    @JsonProperty("lastModifiedBy")

    private String lastModifiedBy = null;

    @JsonProperty("createdTime")

    private Long createdTime = null;

    @JsonProperty("lastModifiedTime")

    private Long lastModifiedTime = null;


}
