package runtrail.dev.backend.service;

import runtrail.dev.backend.entity.BrandEntity;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    List<BrandEntity> getAllBrands();
    Optional<BrandEntity> getBrandById(long id);
}
