package co.istad.springmvcy2.service;

import co.istad.springmvcy2.dto.CreateProductRequest;
import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.model.Product;
import co.istad.springmvcy2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product createNew(CreateProductRequest createProductRequest) {

        return null;
    }
}
