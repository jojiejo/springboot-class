package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.ProductDTO;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;
import com.ecommerce.ecommerce.response.Error;
import com.ecommerce.ecommerce.response.Message;
import com.ecommerce.ecommerce.response.ResponseData;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        List<Product> productList = productRepository.findAll();
        ResponseData response = new ResponseData(true, productList);

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> get(Long productID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = productRepository.findById(productID).orElse(null);
        if(!Optional.ofNullable(product).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);
        }

        ResponseData response = new ResponseData(true, product);

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> create(ProductDTO dto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = new Product();
        product.setName(dto.getName().trim());
        product.setPrice(dto.getPrice());
        productRepository.save(product);

        ResponseData response = new ResponseData(true, product);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> update(ProductDTO dto, Long productID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = productRepository.findById(productID).orElse(null);

        if(!Optional.ofNullable(product).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);
        }

        product.setName(dto.getName().trim());
        product.setPrice(dto.getPrice());
        productRepository.save(product);

        Message message = new Message(true, "Selected product has been updated successfully");

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(message);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> delete(Long productID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = productRepository.findById(productID).orElse(null);

        if(!Optional.ofNullable(product).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);

        }

        productRepository.delete(product);
        Message message = new Message(true, "Selected product has been deleted successfully");

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(message);
    }
}
