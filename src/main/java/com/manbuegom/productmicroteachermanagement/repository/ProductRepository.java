package com.manbuegom.productmicroteachermanagement.repository;

import com.manbuegom.productmicroteachermanagement.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
