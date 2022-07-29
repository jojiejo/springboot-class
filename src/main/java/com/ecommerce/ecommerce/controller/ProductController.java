package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.ProductDTO;
import com.ecommerce.ecommerce.dto.UserDTO;
import com.ecommerce.ecommerce.service.ProductService;
import com.ecommerce.ecommerce.service.UserService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAll() throws Exception {
        log.info("api /api/v1/products from GET is executed...");
        return productService.getAll();
    }

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/product/{product_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> get(@PathVariable Long product_id) throws Exception {
        log.info("api /api/v1/product from GET is executed...");
        return productService.get(product_id);
    }

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody ProductDTO dto){
        log.info("api /api/v1/product from POST is executed...");
        return productService.create(dto);
    }

    @SneakyThrows(Exception.class)
    @PutMapping(path = "/product/{product_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody ProductDTO dto, @PathVariable Long product_id){
        log.info("api /api/v1/product/"+product_id+"/ from PUT is executed...");
        return productService.update(dto, product_id);
    }

    @SneakyThrows(Exception.class)
    @DeleteMapping(path = "/product/{product_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> delete(@PathVariable Long product_id){
        log.info("api /api/v1/user/"+product_id+" from DELETE is executed...");
        return productService.delete(product_id);
    }
}
