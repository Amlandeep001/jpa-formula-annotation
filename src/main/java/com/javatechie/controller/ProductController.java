package com.javatechie.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.dto.ProductResponse;
import com.javatechie.entity.Product;
import com.javatechie.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController
{
	private final ProductService productService;

	@PostMapping
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return productService.saveProducts(products);
	}

	@GetMapping("/all/v01")
	public List<ProductResponse> getAllProducts()
	{
		return productService.getAllProducts();
	}

	@GetMapping("/all/v02")
	public List<Product> getAllProductsV2()
	{
		return productService.getAllProductsWithFormula();
	}

}