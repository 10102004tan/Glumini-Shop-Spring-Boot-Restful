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
@Table(name = "sku_attribute")
public class SkuAttributeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_date")
    private Date updateDate;

}
