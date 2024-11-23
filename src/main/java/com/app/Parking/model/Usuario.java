package com.app.Parking.model;

import com.app.Parking.enumeration.TipoUsuario;
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;

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

    public Usuario(String nombre, String apellido, String password, TipoUsuario tipoUsuario, String telefono, String email, String direccion, Boolean activo, LocalDateTime cr, String crUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.activo = activo;
        this.cr = cr;
        this.crUser = crUser;
    }

    public Usuario(String nombre, String apellido, String password, TipoUsuario tipoUsuario, String telefono, String email, String direccion, LocalDateTime cr) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.cr = cr;
    }

}
