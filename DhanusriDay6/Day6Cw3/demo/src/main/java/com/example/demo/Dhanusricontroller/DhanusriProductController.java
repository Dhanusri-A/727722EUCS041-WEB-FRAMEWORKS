package com.example.demo.Dhanusricontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusriservice.DhanusriProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class DhanusriProductController {
    public DhanusriProductService productService;
    public DhanusriProductController(DhanusriProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<DhanusriProduct> postMethodName(@RequestBody DhanusriProduct product) {
        if(productService.postProduct(product))
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<DhanusriProduct>> getMethodName(@PathVariable("offset") int offset,@PathVariable("pagesize") int size) {
        List<DhanusriProduct> list = productService.pagination(offset,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DhanusriProduct>> getSortedPagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int size,@PathVariable("field") String field) {
        List<DhanusriProduct> list = productService.sortPagination(offset,size,field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<DhanusriProduct> getMethodName(@PathVariable("productId") int id) {
        DhanusriProduct product = productService.getProductById(id);
        if(product==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    
    
}

