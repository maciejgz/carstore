package pl.mg.carstore.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.mg.carstore.domain.Product;

@Repository
public class InMemoryProductRepositoryImpl implements ProductRepository {
    static List<Product> products = new ArrayList<Product>();

    static {
        Product audi = new Product("audi1", "quattro 94", new BigDecimal(50));
        audi.setDescription("audi quattro \'94");
        audi.setCategory("historical");
        audi.setManufacturer("audi");
        audi.setUnitsInStock(50);

        Product audiQ7 = new Product("audi2", "Q7 11", new BigDecimal(100));
        audiQ7.setDescription("audi Q7 \'11");
        audiQ7.setCategory("coupe");
        audiQ7.setManufacturer("audi");
        audiQ7.setUnitsInStock(100);

        Product bmw = new Product("bmw1", "z3", new BigDecimal(70));
        bmw.setDescription("bmw1 z3 \'06");
        bmw.setCategory("cabrio");
        bmw.setManufacturer("bmw");
        bmw.setUnitsInStock(90);

        products.add(audi);
        products.add(bmw);
        products.add(audiQ7);

    }

    @Override
    public List<Product> getAllProducts() {
        return products;

    }

    @Override
    public Product getProductById(String id) {
        Product productById = null;
        for (Product product : products) {
            if (product != null && product.getProductId().equals(id)) {
                productById = product;
            }
        }

        if (productById == null || productById.equals("")) {
            throw new IllegalArgumentException("Searched ID cannot be null");
        }
        return productById;
    }

}
