package com.crio.RENDER_.Deploying.spring.boot.app.using.Render.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // Lombok annotation for getters, setters, toString, equals, hashCode
@NoArgsConstructor // Lombok annotation for no-arg constructor
@AllArgsConstructor // Lombok annotation for all-arg constructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Crucial for Aiven later
    private Long id;
    private String name;
    private String email;

    
}