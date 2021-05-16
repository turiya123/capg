package com.capf.msc.myshoppingcart.web;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capf.msc.myshoppingcart.bean.Product;
import com.capf.msc.myshoppingcart.exception.InvalidCategoryException;
import com.capf.msc.myshoppingcart.exception.InvalidCostRangeException;
import com.capf.msc.myshoppingcart.service.ProductService;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping("/api")
@Api(value = "Online Laptop Store",description = "Various api works on laptop inventory management")
public class ProductRestController {
	
	Set<String> categoryList = new HashSet<>();
	
	@Autowired
	private ProductService service;
	
	public ProductRestController() {
		System.out.println("Product Rest Controller Constructor");
	}
	
	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome : My Shopping App " + LocalDateTime.now();
	} 
	
	@ApiOperation(value = "product post mapping" , response = Product.class)
	@PostMapping("/product")
	public Product insertProduct(@RequestBody @Valid Product product) {
		service.saveProduct(product);
		categoryList.add(product.getCategory());
		return product;
	}
	
	@ApiOperation(value = "product Get mapping to fetch all products" , response = List.class)
	@GetMapping("/products")
	public List<Product> getAllProductd() {
		return service.getAllProductd();
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.doUpdate(product, product.getProductId());
	}
	
	@GetMapping("/delete/{id}")
	public boolean deleteProductByid(@PathVariable int id)
	{
		return service.deleteProductById(id);
	}
	
	@GetMapping("/products/{category}")
	public List<Product> getAllProductsByCategory(@PathVariable String category) throws InvalidCategoryException {
		int flag = 0;
		for(String i : categoryList) {
			if(category.equals(i)) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			throw new InvalidCategoryException(category);
		}
		return service.getAllProductsByCategory(category);
	}
	
	@GetMapping("/products/{category}/{range1}/{range2}")
	public List<Product> getAllProductsByCategoryAndPrice(@PathVariable String category, @PathVariable int range1,@PathVariable int range2) throws InvalidCostRangeException {
		if(category.equals("Laptop")&&range1<10000)
		{
			throw new InvalidCostRangeException(range1,range2);
		}
		return service.getAllProductsByCategoryAndPrice(category, range1, range2);
	}
}
