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

    @Autowired  // Field Injection
    private ProductService productService;

    // R: Read-All
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    // R: Read-One
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    // C: Create-One
    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // U: Update-One
    @PutMapping("/products/{prodId}")
    public String updateProduct(@RequestBody Product product, @PathVariable int prodId) {
        int result = productService.updateProduct(product, prodId);
        return (result == 0) ? "Update successful" : "Update unsuccessful";
    }

    // D: Delete-All
    @DeleteMapping("/products")
    public String deleteProducts() {
        productService.deleteProducts();
        return "All products deleted!";
    }

    // D: Delete-One
//    @DeleteMapping(value = "/product", params = "{prodId}")
//    public String deleteProduct(@RequestParam int prodId) {
    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId) {
        int result = productService.deleteProduct(prodId);
        return (result == 0) ? "Delete successful" : "Delete unsuccessful";
    }
}
