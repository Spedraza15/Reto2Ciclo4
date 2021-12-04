package com.usa.ciclo4.retodos.repository.crud;

import com.usa.ciclo4.retodos.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, Integer> {
}
