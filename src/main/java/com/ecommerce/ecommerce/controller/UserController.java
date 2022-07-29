package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.UserDTO;
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
public class UserController {
    @Autowired
    private UserService userService;

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAll() throws Exception {
        log.info("api /api/v1/users from GET is executed...");
        return userService.getAll();
    }

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/user/{user_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> get(@PathVariable Long user_id) throws Exception {
        log.info("api /api/v1/user from GET is executed...");
        return userService.get(user_id);
    }

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody UserDTO dto){
        log.info("api /api/v1/user from POST is executed...");
        return userService.create(dto);
    }

    @SneakyThrows(Exception.class)
    @PutMapping(path = "/user/{user_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody UserDTO dto, @PathVariable Long user_id){
        log.info("api /api/v1/user/"+user_id+"/ from PUT is executed...");
        return userService.update(dto, user_id);
    }

    @SneakyThrows(Exception.class)
    @DeleteMapping(path = "/user/{user_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> delete(@PathVariable Long user_id){
        log.info("api /api/v1/user/"+user_id+" from DELETE is executed...");
        return userService.delete(user_id);
    }
}
