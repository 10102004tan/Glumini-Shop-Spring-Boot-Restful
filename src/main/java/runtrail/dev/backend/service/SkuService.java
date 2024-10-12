package runtrail.dev.backend.service;

import runtrail.dev.backend.entity.SkuEntity;
import java.util.List;
import java.util.Optional;

public interface SkuService {
    List<SkuEntity> getAllSkus();
    Optional<SkuEntity> getSkuById(long id);
    List<SkuEntity> getSkusByPriceRange(Long minPrice, Long maxPrice);

    List<SkuEntity> findByAttributes(String key, String value);
}
