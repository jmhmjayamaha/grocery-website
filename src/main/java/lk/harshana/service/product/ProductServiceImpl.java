package lk.harshana.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Product;
import lk.harshana.repository.product.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void createProduct(Product product) {
		if(productRepository.findByName(product.getName()) == null ) {
			productRepository.save(product);
		} else {
			// exception
		}

	}

//	@Override
//	public void updateProduct(int id, Product product) {
//		Product p = productRepository.findOne(id);
//		
//		if(p != null) {
//			product.setProduct_id(id);
//			productRepository.save(product);
//		}
//		
//	}
	
	

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProduct(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public boolean deleteProduct(int id) {
		Product product = productRepository.findOne(id);
		
		if(product != null) {
			productRepository.delete(product);
			return true;
		}
		return false;
	}

	@Override
	public int updateProduct(int id, Product product) {
		product.setProduct_id(id);
		return productRepository.updateProduct(product.getName(), product.getPrice(), product.isInStock(), product.getProduct_id());
	}

}
