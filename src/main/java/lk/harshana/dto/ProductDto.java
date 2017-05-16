package lk.harshana.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import lk.harshana.model.Comment;

public class ProductDto {

	@NotNull
	private String name;
	@NotNull
	private float price;
	private boolean inStock;
	private List<Comment> comments = new ArrayList<Comment>();
	
	public ProductDto() {
		
	}
	
	public ProductDto(String name, float price, boolean inStock, List<Comment> comments) {
		super();
		this.name = name;
		this.price = price;
		this.inStock = inStock;
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
