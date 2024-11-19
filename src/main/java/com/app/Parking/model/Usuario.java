package com.app.Parking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false)
    private Integer tipoUsuario;

    private String telefono;

    private String email;

    private String direccion;

    private Boolean activo;

    @Column(nullable = false, insertable = false, updatable = false)
    private LocalDateTime cr;

    @Column(nullable = false, insertable = false, updatable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

    // Getters y Setters
}
