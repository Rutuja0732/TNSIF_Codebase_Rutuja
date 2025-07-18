package com.onlineshopping.allservices;

import java.util.*;

import com.onlineshopping.entities.Product;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId)
                return p;
        }
        return null;
    }
}
