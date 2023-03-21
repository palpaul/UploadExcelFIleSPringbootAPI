package com.optum.groupretiree.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.optum.groupretiree.entity.Product;
import com.optum.groupretiree.services.ProductService;
import com.optum.groupretiree.services.ProductServiceImpl;
import com.optum.groupretiree.utils.RosterUtil;

@RestController
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@PostMapping("/upload")
	public ResponseEntity<?> uploadExcelFile(@RequestParam(value = "file") MultipartFile file) {

		if (RosterUtil.checkExcelFormat(file)) {
			// if true
			this.productService.saveproduct(file);
			return ResponseEntity.ok(Map.of("message", "File is uploaded Successfully"));

		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please Upload Excel file Only");
		}

	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return this.productService.getAllProducts();
	}

}
