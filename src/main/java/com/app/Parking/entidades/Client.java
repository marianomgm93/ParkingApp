package com.app.Parking.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;


@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String telefono;

    private String email;

    @Column(nullable = false)
    private Integer tipoCliente;

    @Column(nullable = false)
    private LocalDateTime cr;

    @Column(nullable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}

