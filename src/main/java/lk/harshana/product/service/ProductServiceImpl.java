package lk.harshana.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Product;
import lk.harshana.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
