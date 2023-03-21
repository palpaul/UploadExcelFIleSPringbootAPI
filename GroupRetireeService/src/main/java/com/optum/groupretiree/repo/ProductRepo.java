package com.optum.groupretiree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optum.groupretiree.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
