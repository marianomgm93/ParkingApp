package com.app.Parking.repository;

import com.app.Parking.enumeration.TipoVehiculo;
import com.app.Parking.model.Vehiculo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    @Query("SELECT v FROM Vehiculo v JOIN v.client c WHERE c.nombre LIKE %:nombreCliente%")
    List<Vehiculo> findVehiculosByClientNombreContaining(@Param("nombreCliente") String nombreCliente);

    Optional<Vehiculo> findByPatente(String patente);
    
    List<Vehiculo> findByTipo(TipoVehiculo tipo);
}
