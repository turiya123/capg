package com.capf.msc.myshoppingcart.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capf.msc.myshoppingcart.bean.Product;
import com.capf.msc.myshoppingcart.dao.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	
	@Autowired
	ProductRepository repo;

	@Override
	public List<Product> getAllProductd() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);
		return p;
	}

	@Override
	public Product doUpdate(Product product, int productId) {
		// TODO Auto-generated method stub
		Product p = repo.findById(productId).get();
		if(p != null) {
			p.setProductId(product.getProductId());
			p.setProductName(product.getProductName());
			p.setProductCost(product.getProductCost());
			p.setStartRating(product.getStartRating());
			p.setCategory(product.getCategory());
		}
		return repo.save(p);
	}
	
	@Override
	public boolean deleteProductById(int id) {
		// TODO Auto-generated method stub
		boolean isDel = true;
		repo.deleteById(id);
		return isDel;
	}
	
	@Override
	public List<Product> getAllProductsByCategory(String category) {
		
		return repo.getProductByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		
		return repo.getProductByCategoryAndPrice(category, range1, range2);
	}

	

}
