package com.telusko.SimpleWeb.controller;

import com.telusko.SimpleWeb.model.Product;
import com.telusko.SimpleWeb.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.addProduct(product);
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        int result = productService.updateProduct(product);
        return (result == 0) ? "Update successful" : "Update unsuccessful";
    }

//    @DeleteMapping(value = "/product", params = "{prodId}")
    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId) {
//    public String deleteProduct(@RequestParam int prodId) {
        int result = productService.deleteProduct(prodId);
        return (result == 0) ? "Delete successful" : "Delete unsuccessful";
    }
}
