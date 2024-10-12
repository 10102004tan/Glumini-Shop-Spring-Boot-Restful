package runtrail.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.entity.SkuImagesEntity;

import java.util.List;

@Repository
public interface SkuImagesRepository extends JpaRepository<SkuImagesEntity, Long> {
    List<SkuImagesEntity> findBySkuId(long skuId); 
}
