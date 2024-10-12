package runtrail.dev.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "brand")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brand_name", nullable = false, length = 50)
    private String brandName;

    @Column(name = "brand_desc")
    private String brandDesc;

    @Column(name = "brand_logo", nullable = false)
    private String brandLogo;

   
}
