package com.sasank.SpringEcom.controller;

import com.sasank.SpringEcom.model.Product;
import com.sasank.SpringEcom.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private productService service;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product p= service.getProductById(id);
        if (p.getId() > 0){
            return new ResponseEntity<>(p,HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/product")
    public ResponseEntity<?> addOrUpdateProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
        Product savedProduct= null;
        try {
            savedProduct = service.addOrUpdateProduct(product,imageFile);
            return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProduct(@PathVariable int productId){
      Product p=  service.getProductById(productId);
        if (p.getId() > 0){
            return new ResponseEntity<>(p.getImageData(),HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id,@RequestPart Product product, @RequestPart MultipartFile imageFile)
    {
        Product updatedProduct= null;
        try{
            updatedProduct = service.addOrUpdateProduct(product,imageFile);
            return new ResponseEntity<>("updated",HttpStatus.OK);
        }
        catch (IOException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id)
    {
        Product product=service.getProductById(id);
        if(product != null){
            service.deleteProductById(id);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword){
        List<Product> products= service.searchProducts(keyword);
        System.out.println("searching with" + keyword);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

}
