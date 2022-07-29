package com.ecommerce.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity (name = "User")
@Table (name = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -4492412758881190962L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, unique = true)
    private Long id;

    @NotBlank
    @Column(name = "username", nullable = false, length = 50)
    private String userName;

    @NotBlank
    @Column(name = "phone", length = 20)
    private String phone;

    @NotBlank
    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

}
