package lk.harshana.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String comment;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "product_comment", joinColumns = @JoinColumn(name = "comment_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Product product;

	public Comment() {

	}

	public Comment(String comment) {
		super();
		this.comment = comment;
	}

	public Comment(String comment, Product product) {
		super();
		this.comment = comment;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

//	public Product getProduct() {
//		return product;
//	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
