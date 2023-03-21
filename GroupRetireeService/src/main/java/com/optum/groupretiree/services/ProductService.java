package com.optum.groupretiree.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.optum.groupretiree.entity.Product;

@Service
public interface ProductService {
	
	public void saveproduct(MultipartFile file);
	
	public List<Product> getAllProducts();

}
