package runtrail.dev.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runtrail.dev.backend.entity.SkuAttributeEntity;
import runtrail.dev.backend.repository.SkuAttributeRepository;
import runtrail.dev.backend.service.SkuAttributeService;

import java.util.List;
import java.util.Optional;

@Service
public class SkuAttributeServiceImpl implements SkuAttributeService {

    @Autowired
    private SkuAttributeRepository skuAttributeRepository;

   

    @Override
    public List<SkuAttributeEntity> getAllSkuAttributes() {
        return skuAttributeRepository.findAll();
    }

    @Override
    public Optional<SkuAttributeEntity> getSkuAttributeById(long id) {
        return skuAttributeRepository.findById(id);
    }

   
}
