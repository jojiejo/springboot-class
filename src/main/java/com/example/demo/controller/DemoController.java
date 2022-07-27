package com.example.demo.controller;

import com.example.demo.response.Responses;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/messages")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getMessages() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        res.put("message", "success");
        res.put("data", "get messages");

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PostMapping("/messages")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> postMessages() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        res.put("message", "success");
        res.put("data", "post messages");

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @DeleteMapping("/messages")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteMessages() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        res.put("message", "success");
        res.put("data", "delete messages");

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

}
