package com.reto3.masterclass3.repository.crudRepository;

import com.reto3.masterclass3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository  extends CrudRepository<Product,Integer> {
}
