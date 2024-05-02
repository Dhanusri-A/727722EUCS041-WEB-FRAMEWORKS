package com.example.demo.Dhanusricontroller;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusriservice.DhanusriProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private DhanusriProductService ProductService;

    @GetMapping
    public ResponseEntity<List<DhanusriProduct>> getAllProducts() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/products; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Products", "N/A");
        List<DhanusriProduct> Products = ProductService.getAllProducts();
        return ResponseEntity.ok(Products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhanusriProduct> getProductById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/products/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Product details", "N/A");
        DhanusriProduct Product = ProductService.getProductById(id);
        return ResponseEntity.ok(Product);
    }

    @PostMapping
    public ResponseEntity<DhanusriProduct> addProduct(@RequestBody DhanusriProduct Product) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/products; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Product, HttpStatus.CREATED.value(), "Product added successfully", "N/A");
        DhanusriProduct savedProduct = ProductService.addProduct(Product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}