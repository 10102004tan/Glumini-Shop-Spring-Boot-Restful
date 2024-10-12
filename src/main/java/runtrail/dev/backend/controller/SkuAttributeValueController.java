package runtrail.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runtrail.dev.backend.entity.SkuAttributeValueEntity;
import runtrail.dev.backend.service.SkuAttributeValueService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sku-attribute-values")
public class SkuAttributeValueController {

    @Autowired
    private SkuAttributeValueService skuAttributeValueService;

    // Lấy tất cả các giá trị thuộc tính SKU
    @GetMapping
    public ResponseEntity<List<SkuAttributeValueEntity>> getAllSkuAttributeValues() {
        List<SkuAttributeValueEntity> skuAttributeValues = skuAttributeValueService.getAllSkuAttributeValues();
        return new ResponseEntity<>(skuAttributeValues, HttpStatus.OK);
    }

    // Lấy giá trị thuộc tính SKU theo ID
    @GetMapping("/{id}")
    public ResponseEntity<SkuAttributeValueEntity> getSkuAttributeValueById(@PathVariable long id) {
        Optional<SkuAttributeValueEntity> skuAttributeValue = skuAttributeValueService.getSkuAttributeValueById(id);
        return skuAttributeValue.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
