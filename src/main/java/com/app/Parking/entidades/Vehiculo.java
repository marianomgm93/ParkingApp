package com.app.Parking.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idClient;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 50)
    private String patente;

    private String marca;

    private String modelo;

    private String descripcion;

    @Column(nullable = false)
    private LocalDateTime cr;

    @Column(nullable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}
