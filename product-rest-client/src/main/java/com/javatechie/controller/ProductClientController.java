package com.javatechie.controller;

import com.javatechie.client.ProductClient;
import com.javatechie.dto.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/client")
public class ProductClientController {

    private final ProductClient productClient;

    public ProductClientController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productClient.getAllProducts();
    }

    @GetMapping("/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productClient.getProductsByCategory(category);
    }

    @PostMapping
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productClient.addNewProduct(products);
    }
}
