package com.app.Parking.controller;

import com.app.Parking.model.Vehiculo;
import com.app.Parking.service.impl.VehiculoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoService;
            
    

    @GetMapping("/buscar-por-cliente")
    public List<Vehiculo> buscarVehiculosPorNombreCliente(@RequestParam String nombreCliente) {
        return vehiculoService.buscarPorClientNombre(nombreCliente);
    }
}
