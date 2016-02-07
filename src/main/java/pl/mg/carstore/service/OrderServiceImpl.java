package pl.mg.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.mg.carstore.domain.Product;
import pl.mg.carstore.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int count) {
        Product product = productRepository.getProductById(productId);
        if (product.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Out of stock: " + product.getName());
        }
        product.setUnitsInStock(product.getUnitsInStock() - count);
    }

}
