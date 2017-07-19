package com.obs.service;

import java.util.List;

import com.obs.pojos.Product;

public interface ProductService {
	String addProduct(Product p);
	List<Product> listProducts();
	String updateProduct(Product p);
	String deleteProduct(Integer id);
	Product getProductById(Integer id);
	List<Product> listProductByPages(Integer begin, Integer offset);
	String deactivateProductById(Integer id);
	
}
