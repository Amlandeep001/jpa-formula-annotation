package com.jpa.formula.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.formula.Mapper.ProductResponseMapper;
import com.jpa.formula.dto.ProductResponse;
import com.jpa.formula.entity.Product;
import com.jpa.formula.repository.ProductRepository;

@Service
public class ProductService
{
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository)
	{
		this.productRepository = productRepository;
	}

	public List<Product> saveProducts(List<Product> products)
	{
		return productRepository.saveAll(products);
	}

	public List<ProductResponse> getAllProducts()
	{
		return productRepository.findAll()
				.stream()
				.map(ProductResponseMapper::map)
				.toList();
	}

	public List<Product> getAllProductsWithFormula()
	{
		return productRepository.findAll();
	}

}