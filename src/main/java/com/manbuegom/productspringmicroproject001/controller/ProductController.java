package com.manbuegom.productspringmicroproject001.controller;

import com.manbuegom.productspringmicroproject001.entity.ProductEntity;
import com.manbuegom.productspringmicroproject001.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    /*Otra forma para manejar las respuestas con HttpStatus
    @GetMapping
    public ProductEntity findProductById(String id){
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        ResponseEntity<Optional<ProductEntity>> responseEntity = new ResponseEntity<>(productEntity, HttpStatus.OK);
        return productEntity.orElse(null);
    }
     */

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }
}
