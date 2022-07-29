package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.UserDTO;
import com.ecommerce.ecommerce.response.Error;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepository;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        List<User> userList = userRepository.findAll();
        ResponseData response = new ResponseData(true, userList);

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> get(Long userID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        User user = userRepository.findById(userID).orElse(null);
        if(!Optional.ofNullable(user).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);
        }

        ResponseData response = new ResponseData(true, user);

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> create(UserDTO dto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        User user = new User();
        user.setUserName(dto.getUsername().trim());
        user.setPhone(dto.getPhone().trim());
        user.setAddress(dto.getAddress().trim());
        userRepository.save(user);

        ResponseData response = new ResponseData(true, user);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body(response);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> update(UserDTO dto, Long userID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        User user = userRepository.findById(userID).orElse(null);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "success");
        response.put("data", user);

        if(!Optional.ofNullable(user).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);
        }

        user.setUserName(dto.getUsername().trim());
        user.setPhone(dto.getPhone().trim());
        user.setAddress(dto.getAddress().trim());
        userRepository.save(user);

        Message message = new Message(true, "Selected user has been updated successfully");

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(message);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> delete(Long userID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        User user = userRepository.findById(userID).orElse(null);

        if(!Optional.ofNullable(user).isPresent()) {
            Error err = new Error(false, "Data not found");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body(err);

        }

        userRepository.delete(user);
        Message message = new Message(true, "Selected user has been deleted successfully");

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(message);
    }
}
