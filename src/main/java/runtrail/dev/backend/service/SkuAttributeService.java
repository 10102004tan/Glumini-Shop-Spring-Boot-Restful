package runtrail.dev.backend.service;

import runtrail.dev.backend.entity.SkuAttributeEntity;

import java.util.List;
import java.util.Optional;

public interface SkuAttributeService {
    List<SkuAttributeEntity> getAllSkuAttributes();
    Optional<SkuAttributeEntity> getSkuAttributeById(long id);
}
