package runtrail.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.entity.SkuAttributeEntity;

import java.util.List;

@Repository
public interface SkuAttributeRepository extends JpaRepository<SkuAttributeEntity, Long> {
    List<SkuAttributeEntity> findByName(String name);
}
