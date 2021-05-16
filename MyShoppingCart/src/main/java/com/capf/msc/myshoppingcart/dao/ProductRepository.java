package com.capf.msc.myshoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capf.msc.myshoppingcart.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>, CustomProductRepository{

}
