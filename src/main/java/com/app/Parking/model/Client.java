package com.app.Parking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Client(String nombre, String telefono, String email, Integer tipoCliente, LocalDateTime cr, String crUser) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.tipoCliente = tipoCliente;
        this.cr = cr;
        this.crUser = crUser;
    }

}
