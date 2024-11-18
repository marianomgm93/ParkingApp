package com.app.Parking.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class MediosPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medioDePago;

    private Double recargo;

    @Column(nullable = false)
    private LocalDateTime cr;

    @Column(nullable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}

