package runtrail.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.entity.SpuImagesEntity;

import java.util.List;

@Repository
public interface SpuImagesRepository extends JpaRepository<SpuImagesEntity, Long> {
    List<SpuImagesEntity> findBySpuId(long spuId); 
}
