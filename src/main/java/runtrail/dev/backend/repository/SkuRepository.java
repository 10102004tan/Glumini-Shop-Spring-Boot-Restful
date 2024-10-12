package runtrail.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.entity.SkuEntity;

import java.util.List;

@Repository
public interface SkuRepository extends JpaRepository<SkuEntity, Long> {
    List<SkuEntity> findBySkuName(String skuName);
    // Truy vấn để tìm các sản phẩm có giá nằm trong khoảng giá trị
    List<SkuEntity> findBySkuPriceBetween(Long minPrice, Long maxPrice);

    @Query("SELECT sku FROM SkuEntity sku where JSON_EXTRACT(sku.skuAttri,CONCAT('$.',:key)) = :value")
    List<SkuEntity> findByAttributes(@Param("key") String key,@Param("value") String value);
}
