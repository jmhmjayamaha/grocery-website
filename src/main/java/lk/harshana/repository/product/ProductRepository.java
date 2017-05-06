package lk.harshana.product.repository;

import org.springframework.data.repository.CrudRepository;

import lk.harshana.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findByName(String name);
	
}
