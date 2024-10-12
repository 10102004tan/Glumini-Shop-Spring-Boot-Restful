package runtrail.dev.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runtrail.dev.backend.entity.SkuImagesEntity;
import runtrail.dev.backend.repository.SkuImagesRepository;
import runtrail.dev.backend.service.SkuImagesService;

import java.util.List;
import java.util.Optional;

@Service
public class SkuImagesServiceImpl implements SkuImagesService {

    @Autowired
    private SkuImagesRepository skuImagesRepository;

   
    @Override
    public List<SkuImagesEntity> getAllSkuImages() {
        return skuImagesRepository.findAll();
    }

    @Override
    public Optional<SkuImagesEntity> getSkuImageById(long id) {
        return skuImagesRepository.findById(id);
    }

   
}
