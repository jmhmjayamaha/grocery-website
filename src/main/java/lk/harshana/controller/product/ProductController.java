package lk.harshana.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.model.Product;
import lk.harshana.service.product.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public List<Product> getAllProducts() {
		return productService.getAllProduct();
	}
}
