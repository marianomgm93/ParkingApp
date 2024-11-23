package com.app.Parking.service.impl;

import com.app.Parking.enumeration.TipoVehiculo;
import com.app.Parking.exception.MiException;
import com.app.Parking.model.Client;
import com.app.Parking.model.Vehiculo;
import com.app.Parking.repository.VehiculoRepository;
import com.app.Parking.service.VehiculoService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
// terminar metodo buscar por tipo
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Transactional
    @Override
    public void registrar(Client client, TipoVehiculo tipo, String patente) {
        Vehiculo vehiculo = new Vehiculo(client, tipo, patente, LocalDateTime.now());
        vehiculoRepository.save(vehiculo);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Vehiculo> listar() {
        return (List<Vehiculo>) vehiculoRepository.findAll();
    }

    @Override
    public void modificar(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional(readOnly = true)
    @Override
    public Vehiculo buscarPorPatente(String patente) throws MiException {
        Optional<Vehiculo> respuesta = vehiculoRepository.findByPatente(patente);
        if (respuesta.isPresent()) {
            Vehiculo vehiculo = respuesta.get();
            return vehiculo;
        } else {
            throw new MiException("No hay ningun registro con la patente ingresada");
        }

    }

    @Transactional(readOnly = true)
    @Override
    public List<Vehiculo> buscarPorClientNombre(String nombre) {
        List<Vehiculo> vehiculos = vehiculoRepository.findVehiculosByClientNombreContaining(nombre);
        return vehiculos;
    }

    @Override
    public List<Vehiculo> buscarPorTipo(TipoVehiculo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
