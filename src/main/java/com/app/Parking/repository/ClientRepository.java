package com.app.Parking.repository;

import com.app.Parking.model.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByNombreContaining(String fragmentoNombre);

    Optional<Client> findByEmail(String email);
}
