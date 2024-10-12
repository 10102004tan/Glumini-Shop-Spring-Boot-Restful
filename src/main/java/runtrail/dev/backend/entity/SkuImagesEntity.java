package runtrail.dev.backend.entity;

import lombok.Data;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "sku_images")
public class SkuImagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sku_id")
    private long skuId;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "img_default")
    private int imgDefault;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    
}
