package runtrail.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runtrail.dev.backend.entity.SpuImagesEntity;
import runtrail.dev.backend.service.SpuImagesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/spu-images")
public class SpuImagesController {

    @Autowired
    private SpuImagesService spuImagesService;


    // Lấy tất cả các hình ảnh SPU
    @GetMapping
    public ResponseEntity<List<SpuImagesEntity>> getAllSpuImages() {
        List<SpuImagesEntity> spuImages = spuImagesService.getAllSpuImages();
        return new ResponseEntity<>(spuImages, HttpStatus.OK);
    }

    // Lấy hình ảnh SPU theo ID
    @GetMapping("/{id}")
    public ResponseEntity<SpuImagesEntity> getSpuImageById(@PathVariable long id) {
        Optional<SpuImagesEntity> spuImage = spuImagesService.getSpuImageById(id);
        return spuImage.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    
}
