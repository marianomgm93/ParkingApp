package com.app.Parking.service;

import com.app.Parking.enumeration.TipoVehiculo;
import com.app.Parking.exception.MiException;
import com.app.Parking.model.Client;
import com.app.Parking.model.Estadia;
import com.app.Parking.model.Vehiculo;
import java.util.List;

public interface EstadiaService {
    public void registrar(Client client, TipoVehiculo tipo, String patente);
    
    public List<Estadia> listar();

    public void modificar(Estadia estadia);

    public void eliminar(Estadia estadia);

    public Estadia buscarPorPatente(String patente) throws MiException;

    public List<Estadia> buscarPorClientNombre(String nombre);
}
