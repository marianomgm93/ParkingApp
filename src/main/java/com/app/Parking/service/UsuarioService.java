package com.app.Parking.service;

import com.app.Parking.enumeration.TipoUsuario;
import com.app.Parking.exception.MiException;
import com.app.Parking.model.Usuario;
import java.util.List;

public interface UsuarioService {

    public void registrar(String nombre, String apellido, String password, TipoUsuario tipoUsuario, String telefono, String email, String direccion);


    public List<Usuario> listar();

    public void modificar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public Usuario buscarPorEmail(String email) throws MiException;

}
