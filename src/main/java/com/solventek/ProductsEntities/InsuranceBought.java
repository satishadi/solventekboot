package com.solventek.ProductsEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class InsuranceBought {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int productId;
	
	
	public InsuranceBought() {
	
	}
	public InsuranceBought(int id, int productId) {
		super();
		this.id = id;
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "InsuranceBought [id=" + id + ", productId=" + productId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

}