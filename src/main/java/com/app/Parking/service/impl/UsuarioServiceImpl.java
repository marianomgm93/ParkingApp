package com.app.Parking.service.impl;

import com.app.Parking.exception.MiException;
import com.app.Parking.model.Usuario;
import com.app.Parking.repository.UsuarioRepository;
import com.app.Parking.service.UsuarioService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public void registrar(String nombre, String apellido, String password, Integer tipoUsuario, String telefono, String email, String direccion) {

        Usuario usuario = new Usuario(nombre, apellido, password, tipoUsuario, telefono, email, direccion, LocalDateTime.MIN);

        usuarioRepository.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarPersonas() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    //CREAR MODIFICAR USUARIO
    @Override
    @Transactional
    public void modificar(Usuario usuario) {

        usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {
        usuario.setActivo(false);
        usuarioRepository.save(usuario);
    }

    /**
     * Buscar usuario por email
     *
     * @param email
     * @return
     * @throws MiException
     */
    @Override
    @Transactional(readOnly = true)
    public Usuario buscarPorEmail(String email) throws MiException {
        Optional<Usuario> respuesta = usuarioRepository.findByEmail(email);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            return usuario;

        } else {
            throw new MiException("El email es invalido o se encuentra vacio");
        }

    }

}
