package lk.harshana.controller.product;

import java.util.AbstractMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.dto.ProductDto;
import lk.harshana.model.Product;
import lk.harshana.service.product.ProductService;

@RestController
@RequestMapping(value="/grocery-website/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public List<Product> getAllProducts() {
		return productService.getAllProduct();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/search/{name}")
	@ResponseStatus(value=HttpStatus.OK)
	public Product getProduct(@PathVariable("name") String name) {
		return productService.getProduct(name);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createProduct(@RequestBody @Validated ProductDto productDto) {
		Product product = new Product(productDto.getName(), productDto.getPrice(),productDto.isInStock(), productDto.getComments() );
		productService.createProduct(product);
	}
	
//	@RequestMapping(method = RequestMethod.PUT, value="/{id}")
//	@ResponseStatus(value = HttpStatus.CREATED)
//	public void updateProduct(@PathVariable("id") int id, @RequestBody @Validated ProductDto productDto) {
//		Product product = new Product(productDto.getName(), productDto.getPrice(),productDto.isInStock(), productDto.getComments() );
//		productService.updateProduct(id, product);
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public AbstractMap.SimpleEntry<String, String> deleteProduct(@PathVariable("id") int id) {
		if(productService.deleteProduct(id)) {
			return new AbstractMap.SimpleEntry<String, String>("status", "deleted");
		}
		return new AbstractMap.SimpleEntry<String, String>("status", "not deleted");
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void updateProduct(@PathVariable("id") int id, @RequestBody ProductDto dto) {
		Product product = new Product(dto.getName(), dto.getPrice(),dto.isInStock(), null);
		int i = productService.updateProduct(id, product);
	}
}
 