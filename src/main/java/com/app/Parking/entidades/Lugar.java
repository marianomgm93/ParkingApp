package com.app.Parking.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;

    @Column(nullable = false)
    private Boolean ocupado;

    @Column(nullable = false)
    private LocalDateTime cr;

    @Column(nullable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}
