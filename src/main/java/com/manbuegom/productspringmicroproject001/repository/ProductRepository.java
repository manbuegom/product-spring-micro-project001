package com.manbuegom.productspringmicroproject001.repository;

import com.manbuegom.productspringmicroproject001.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
