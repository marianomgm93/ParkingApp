package com.app.Parking.repository;

import com.app.Parking.model.MediosPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediosPagoRepository extends JpaRepository<MediosPago, Long> {

}
