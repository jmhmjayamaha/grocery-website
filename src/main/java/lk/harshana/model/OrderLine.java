package lk.harshana.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderLine")
public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderLineId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product;
	private int amount;
	private float purchacePrice;
	
	public OrderLine() {
		
	}

	public OrderLine(Product product, int amount, float purchacePrice) {
		super();
		this.product = product;
		this.amount = amount;
		this.purchacePrice = purchacePrice;
	}

	public Integer getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(Integer orderLineId) {
		this.orderLineId = orderLineId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPurchacePrice() {
		return purchacePrice;
	}

	public void setPurchacePrice(float purchacePrice) {
		this.purchacePrice = purchacePrice;
	}

}
