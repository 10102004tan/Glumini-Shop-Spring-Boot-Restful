package runtrail.dev.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import runtrail.dev.backend.dto.response.SpuDTO;
import runtrail.dev.backend.entity.SpuEntity;
import runtrail.dev.backend.exception.ErrorExceptionHandler;
import runtrail.dev.backend.repository.SpuRepository;
import runtrail.dev.backend.service.SpuService;

import java.util.List;
import java.util.Optional;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuRepository spuRepository;

    @Override
    public List<SpuEntity> getAllSpus() {
        return spuRepository.findAll();
    }

    @Override
    public Optional<SpuEntity> getSpuById(long id) {
        return spuRepository.findById(id);
    }

    @Override
    public Page<SpuEntity> findAllSpu(Pageable pageable) {
        return spuRepository.findAll(pageable);
    }

    @Override
    public Page<SpuDTO> getSpuByFilter(long minPrice,long maxPrice,List<Long> brandIds,int sortPrice,Pageable pageable) {
        brandIds = brandIds.isEmpty() ? null : brandIds;
        sortPrice = sortPrice == 0 ? 0 : 1;
        return spuRepository.findBySpuFilter(minPrice,maxPrice,sortPrice, brandIds,pageable);
    }
}
