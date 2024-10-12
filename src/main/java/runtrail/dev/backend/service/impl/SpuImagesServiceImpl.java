package runtrail.dev.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runtrail.dev.backend.entity.SpuImagesEntity;
import runtrail.dev.backend.repository.SpuImagesRepository;
import runtrail.dev.backend.service.SpuImagesService;

import java.util.List;
import java.util.Optional;

@Service
public class SpuImagesServiceImpl implements SpuImagesService {

    @Autowired
    private SpuImagesRepository spuImagesRepository;


    @Override
    public List<SpuImagesEntity> getAllSpuImages() {
        return spuImagesRepository.findAll();
    }

    @Override
    public Optional<SpuImagesEntity> getSpuImageById(long id) {
        return spuImagesRepository.findById(id);
    }
}
