package co.istad.springmvcy2.service;

import co.istad.springmvcy2.dto.CreateProductRequest;
import co.istad.springmvcy2.model.Product;

public interface ProductService {

    public Product createNew(CreateProductRequest createProductRequest);
}
