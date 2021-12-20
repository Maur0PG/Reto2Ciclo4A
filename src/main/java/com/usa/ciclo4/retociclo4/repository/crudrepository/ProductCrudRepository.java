package com.usa.ciclo4.retociclo4.repository.crudrepository;

import java.util.List;

import com.usa.ciclo4.retociclo4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, Integer> {

    public List<Product> findByPriceLessThanEqual(double price);
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
}
