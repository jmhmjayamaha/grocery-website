package lk.harshana.service.product;

import java.util.List;

import lk.harshana.model.Product;

public interface ProductService {

	void createProduct(Product product);
//	void updateProduct(int id, Product product);
	int updateProduct(int id, Product product);
	List<Product> getAllProduct();
	Product getProduct(String name);
	boolean deleteProduct(int id);
}
