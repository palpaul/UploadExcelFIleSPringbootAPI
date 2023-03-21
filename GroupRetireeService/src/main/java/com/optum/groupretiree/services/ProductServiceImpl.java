package com.optum.groupretiree.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.optum.groupretiree.entity.Product;
import com.optum.groupretiree.exception.GroupRetireeCustomException;
import com.optum.groupretiree.repo.ProductRepo;
import com.optum.groupretiree.utils.RosterUtil;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void saveproduct(MultipartFile file) {
		try {
			List<Product> products = RosterUtil.convertExcelToListOfProduct(file.getInputStream());
			System.out.println("inserting data");
			this.productRepo.saveAll(products);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new GroupRetireeCustomException(e.getMessage());
		}

	}

	@Override
	public List<Product> getAllProducts() {

		return this.productRepo.findAll();
	}

}
