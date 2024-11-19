package com.app.Parking.service;

import com.app.Parking.model.Usuario;
import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarPersonas();
    
    public void guardar(Usuario usuario);
    
    public void eliminar(Usuario usuario);
    
    public Usuario encontrarPersona(Usuario usuario);
    
}
