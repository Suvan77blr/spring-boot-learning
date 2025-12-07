package com.telusko.SimpleWeb.service;

import com.telusko.SimpleWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "ProdA", 100.0f),
            new Product(102, "ProdB", 200.0f),
            new Product(103, "ProdC", 300.0f),
            new Product(104, "ProdD", 400.0f)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(prodId, "Item Not Found", 0.0f));
//                .findFirst().get();
    }

//    public void addProduct(Product product) {
//        products.add(product);
//    }
    public String addProduct(Product product) {
        products.add(product);
        return "Product " + product.getProdId() + " added successfully!";
    }

    public int updateProduct(Product prod) {
        int idx = getProductIdx(prod.getProdId());
        if(idx != -1) {
            products.set(idx, prod);
            return 0;
        }
        return 1;
    }

    public int deleteProduct(int prodId) {
        int idx = getProductIdx(prodId);
        if(idx == -1) return 1;

        products.remove(idx);
        return 0;
    }

    private int getProductIdx(int keyProdId) {
        for(int i=0; i<products.size(); i++) {
            if(products.get(i).getProdId() == keyProdId) {
                return i;
            }
        }
        return -1;
    }
}
