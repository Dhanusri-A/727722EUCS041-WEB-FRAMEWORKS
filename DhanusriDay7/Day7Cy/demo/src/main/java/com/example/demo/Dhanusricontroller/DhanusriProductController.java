package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusriservice.DhanusriProductService;

@RestController
public class DhanusriProductController {
    @Autowired
    DhanusriProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<DhanusriProduct> postMethod(@RequestBody DhanusriProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<DhanusriProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<DhanusriProduct>> dndcjk() {
        List<DhanusriProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<DhanusriProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<DhanusriProduct>> getbyid(@PathVariable String productCategory) {
        List<DhanusriProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DhanusriProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<DhanusriProduct>> getbdyid(@PathVariable String priceCategory) {
        List<DhanusriProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DhanusriProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}

