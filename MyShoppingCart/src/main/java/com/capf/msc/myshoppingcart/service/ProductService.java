package com.capf.msc.myshoppingcart.service;

import java.util.List;

import com.capf.msc.myshoppingcart.bean.Product;

public interface ProductService {
	public List<Product> getAllProductd();
	public Product saveProduct(Product p);
	public Product doUpdate(Product product, int productId);
	public boolean deleteProductById(int id);
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2);
	public List<Product> getAllProductsByCategory(String category);
}
