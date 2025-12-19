package com.example.product_service.application;

import com.example.product_service.domain.Product;
import com.example.product_service.domain.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements CreateProductUseCase, GetProductUseCase {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product create(String name, double price) {
        Product product = new Product(null, name, price);
        return repository.save(product);
    }

    @Override
    public Optional<Product> getById(Long id) {
        return repository.findById(id);
    }
}