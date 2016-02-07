package pl.mg.carstore.repository;

import java.util.List;

import pl.mg.carstore.domain.Product;

public interface ProductRepository {

    public List<Product> getAllProducts();
    public Product getProductById(String id); 
}
