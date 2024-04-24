package com.example.demo.Dhanusricontroller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusriservice.DhanusriProductService;



@RestController
@RequestMapping("api")
public class DhanusriProductController {

    @Autowired
    DhanusriProductService productService;

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public DhanusriProduct getAllProduct(@RequestBody DhanusriProduct product) {
        return productService.addProduct(product);
    }

    @GetMapping("/product")
    public ResponseEntity<List<DhanusriProduct>> getMethodName() {
        List<DhanusriProduct> list = productService.getAllProducts();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<DhanusriProduct>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<DhanusriProduct> getMethodName(@PathVariable int productId) {
        Optional<DhanusriProduct> product = productService.getProductById(productId);

        if (product.isPresent()) {
            return new ResponseEntity<>(product.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}