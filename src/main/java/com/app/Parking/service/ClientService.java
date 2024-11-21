package com.app.Parking.service;

import com.app.Parking.exception.MiException;
import com.app.Parking.model.Client;
import java.time.LocalDateTime;
import java.util.List;

public interface ClientService {

    public void registrar(String nombre, String telefono, String email, Integer tipoCliente);

    public List<Client> listar();

    public void modificar(Client client);

    public void eliminar(Client client);

    public Client buscarPorEmail(String email) throws MiException;

    public List<Client> listarPorNombre(String nombre) throws MiException;

}
