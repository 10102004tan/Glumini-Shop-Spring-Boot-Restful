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
@Table(name = "spu_images")
public class SpuImagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "spu_id")
    private long spuId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "img_default")
    private int imgDefault;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}
