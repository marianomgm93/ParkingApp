package com.app.Parking.service;

import com.app.Parking.enumeration.TipoVehiculo;
import com.app.Parking.exception.MiException;
import com.app.Parking.model.Client;
import com.app.Parking.model.Vehiculo;
import java.util.List;

public interface VehiculoService {

    public void registrar(Client client, TipoVehiculo tipo, String patente);

    public List<Vehiculo> listar();

    public void modificar(Vehiculo vehiculo);

    public void eliminar(Vehiculo vehiculo);

    public Vehiculo buscarPorPatente(String patente) throws MiException;

    public List<Vehiculo> buscarPorClientNombre(String nombre);

    public List<Vehiculo> buscarPorTipo(TipoVehiculo tipo);
}
