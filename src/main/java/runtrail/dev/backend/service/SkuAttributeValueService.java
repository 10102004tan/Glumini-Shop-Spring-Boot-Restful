package runtrail.dev.backend.service;

import runtrail.dev.backend.entity.SkuAttributeValueEntity;

import java.util.List;
import java.util.Optional;

public interface SkuAttributeValueService {
    List<SkuAttributeValueEntity> getAllSkuAttributeValues();
    Optional<SkuAttributeValueEntity> getSkuAttributeValueById(long id);
}
