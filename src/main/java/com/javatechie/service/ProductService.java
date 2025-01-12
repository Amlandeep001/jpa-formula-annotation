package com.javatechie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javatechie.Mapper.ProductResponseMapper;
import com.javatechie.dto.ProductResponse;
import com.javatechie.entity.Product;
import com.javatechie.repository.ProductRepository;

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