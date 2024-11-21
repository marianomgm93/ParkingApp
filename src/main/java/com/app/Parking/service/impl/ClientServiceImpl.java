package com.app.Parking.service.impl;

import com.app.Parking.exception.MiException;
import com.app.Parking.model.Client;
import com.app.Parking.model.Usuario;
import com.app.Parking.repository.ClientRepository;
import com.app.Parking.service.ClientService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
//falta crear Modificar y eliminar, tambien acomodar el model para que funcione correctamente

public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Client> listar() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    @Transactional
    public void registrar(String nombre, String telefono, String email, Integer tipoCliente) {
        Client client = new Client(nombre, telefono, email, tipoCliente, LocalDateTime.now());
        clientRepository.save(client);

    }

    @Override
    public void modificar(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Client buscarPorEmail(String email) throws MiException {
        Optional<Client> respuesta = clientRepository.findByEmail(email);
        if (respuesta.isPresent()) {
            Client client = respuesta.get();
            return client;
        } else {
            throw new MiException("No existe ningun cliente ligado al email ingresado");
        }
    }

    @Override
    public List<Client> listarPorNombre(String nombre) throws MiException {
        List<Client> clientes = clientRepository.findByNombreContaining(nombre);
        return clientes;
    }

}
