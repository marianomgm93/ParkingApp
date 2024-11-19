package com.app.Parking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class MediosPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medioDePago;

    private Double recargo;

    @Column(nullable = false, insertable = false, updatable = false)
    private LocalDateTime cr;

    @Column(nullable = false, insertable = false, updatable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

}

