package com.app.Parking.model;

import com.app.Parking.enumeration.TipoVehiculo;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IdClient", nullable = false)
    private Client client;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private TipoVehiculo tipo;

    @Column(nullable = false, length = 50)
    private String patente;

    private String marca;

    private String modelo;

    private String descripcion;

    @Column(nullable = false, insertable = false, updatable = false)
    private LocalDateTime cr;

    @Column(nullable = false, insertable = false, updatable = false)
    private String crUser;

    private LocalDateTime ts;

    private String tsUser;

    public Vehiculo(Client client, TipoVehiculo tipo, String patente, LocalDateTime cr) {
        this.client = client;
        this.tipo = tipo;
        this.patente = patente;
        this.cr = cr;
    }

}
