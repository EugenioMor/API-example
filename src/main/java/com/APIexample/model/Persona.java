package com.APIexample.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String ubication;
    private String position;
    private String fullName;
    private String image;
    private String user;
    private String password;

    public Persona() {
    }

    public Persona(Long id, String ubication, String position, String fullName, String image, String user, String password) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
        this.user = user;
        this.password = password;
    }
}
