package com.capf.msc.myshoppingcart.bean;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value = "Product Bean")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@ApiModelProperty(name = "ProductName",value = "Hold the min 3 char product name",required = true)
	@NotEmpty(message = "Product Name cannot be left blank or null")
	@Size(min = 3,max = 15, message = "Invalid Product Name")
	private String productName;
	
	@Min(value = 1000, message = "Cost cannot be less than 1000")
	@ApiModelProperty(name = "Product cost",value = "Holds Product cost min cost 1000 allowed")
	private int productCost;
	
	@Min(value = 1, message = "Rating cannot be less than 1")
	@Max(value = 5, message = "Rating cannot be more than 5")
	private int startRating;
	
	@NotEmpty(message = "Category name cannot be left blank or null")
	private String category;
	
	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getStartRating() {
		return startRating;
	}

	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + productCost;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + startRating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (productCost != other.productCost)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (startRating != other.startRating)
			return false;
		return true;
	}
	
	
	
}
