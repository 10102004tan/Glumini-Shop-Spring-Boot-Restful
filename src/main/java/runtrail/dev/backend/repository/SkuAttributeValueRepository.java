package runtrail.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.entity.SkuAttributeValueEntity;

import java.util.List;

@Repository
public interface SkuAttributeValueRepository extends JpaRepository<SkuAttributeValueEntity, Long> {
    List<SkuAttributeValueEntity> findByAttriId(long attriId); 
}
