package runtrail.dev.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import runtrail.dev.backend.dto.response.SpuDTO;
import runtrail.dev.backend.entity.SpuEntity;

import java.util.List;
import java.util.Optional;

public interface SpuService {
    List<SpuEntity> getAllSpus();
    Optional<SpuEntity> getSpuById(long id);

    Page<SpuEntity> findAllSpu(Pageable pageable);

    Page<SpuDTO> getSpuByFilter(long minPrice,long maxPrice,List<Long> brandIds,int sortPrice, Pageable pageable);
}
