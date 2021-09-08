package com.appirest.Api.Rest.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users") // Especificamos a qué tabla apunta nuestra clase
public class User {

    // Utilizamos el Proyecto Lombok para simplificar el uso de getter's y setter's
    @Getter
    @Setter
    @Column(name = "id")
    @Id
    private int id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Column(name = "age")
    private int age;

}