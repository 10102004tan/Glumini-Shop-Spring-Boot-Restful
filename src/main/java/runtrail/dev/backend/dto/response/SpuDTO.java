package runtrail.dev.backend.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SpuDTO {
    private long id;

    private String spuName;

    private String spuDescription;

    private long categoryId;

    private long brandId;

    private long spuPrice;

    private String spuThumbnail;

    private int spuStatus;

}
