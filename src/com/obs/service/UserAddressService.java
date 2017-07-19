package com.obs.service;

import java.util.List;

import com.obs.pojos.Product;

public interface UserAddressService {
	String registerCustomer(Product p);
	List<Product> listProducts();
	String updateProduct(Product p);
	String deleteProduct(Integer id);
	Product getProductById(Integer id);
	List<Product> listProductByPages(Integer begin, Integer end);
	String deactivateProductById(Integer id);
	
}
