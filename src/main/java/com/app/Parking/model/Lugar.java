package com.app.Parking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @Column(nullable = false)
    private Boolean ocupado;

    @Column(nullable = false, insertable = false, updatable = false)
    private LocalDateTime cr;

    @Column(nullable = false, insertable = false, updatable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}
