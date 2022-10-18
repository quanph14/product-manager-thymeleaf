package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Táo", "mùa xuân", 300));
        products.put(2, new Product(2, "Lê", "mùa xuân", 400));
        products.put(3, new Product(3, "Xoài", "mùa hạ", 500));
        products.put(4, new Product(4, "Bưởi", "mùa hạ", 350));
        products.put(5, new Product(5, "Ổi", "mùa thu", 450));
        products.put(6, new Product(6, "Thanh Long", "mùa thu", 200));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
