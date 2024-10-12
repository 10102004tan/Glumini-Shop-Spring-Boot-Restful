package runtrail.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runtrail.dev.backend.entity.SkuImagesEntity;
import runtrail.dev.backend.service.SkuImagesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sku-images")
public class SkuImagesController {

    @Autowired
    private SkuImagesService skuImagesService;

    // Lấy tất cả các hình ảnh SKU
    @GetMapping
    public ResponseEntity<List<SkuImagesEntity>> getAllSkuImages() {
        List<SkuImagesEntity> skuImages = skuImagesService.getAllSkuImages();
        return new ResponseEntity<>(skuImages, HttpStatus.OK);
    }

    // Lấy hình ảnh SKU theo ID
    @GetMapping("/{id}")
    public ResponseEntity<SkuImagesEntity> getSkuImageById(@PathVariable long id) {
        Optional<SkuImagesEntity> skuImage = skuImagesService.getSkuImageById(id);
        return skuImage.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
