package runtrail.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runtrail.dev.backend.entity.SkuAttributeEntity;
import runtrail.dev.backend.service.SkuAttributeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sku-attributes")
public class SkuAttributeController {

    @Autowired
    private SkuAttributeService skuAttributeService;


    // Lấy tất cả các thuộc tính SKU
    @GetMapping
    public ResponseEntity<List<SkuAttributeEntity>> getAllSkuAttributes() {
        List<SkuAttributeEntity> skuAttributes = skuAttributeService.getAllSkuAttributes();
        return new ResponseEntity<>(skuAttributes, HttpStatus.OK);
    }

    // Lấy thuộc tính SKU theo ID
    @GetMapping("/{id}")
    public ResponseEntity<SkuAttributeEntity> getSkuAttributeById(@PathVariable long id) {
        Optional<SkuAttributeEntity> skuAttribute = skuAttributeService.getSkuAttributeById(id);
        return skuAttribute.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

   
}
