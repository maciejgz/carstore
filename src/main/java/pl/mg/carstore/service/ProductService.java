package pl.mg.carstore.service;

import java.util.List;

import pl.mg.carstore.domain.Product;

public interface ProductService {

    public List<Product> getAllProducts();
    public Product getProductById(String productId);
        
}
