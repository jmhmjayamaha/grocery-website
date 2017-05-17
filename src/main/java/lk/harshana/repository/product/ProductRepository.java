package lk.harshana.repository.product;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import lk.harshana.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findByName(String name);
	
	@Transactional
	@Modifying
	@Query("UPDATE Product p SET p.name = ?1, p.price = ?2, p.inStock = ?3 WHERE p.product_id = ?4")
	int updateProduct(String name, float price, boolean inStock, int product_id);
}
