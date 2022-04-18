package com.crimen.crimen.repository;

import com.crimen.crimen.model.Invitado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvitadoRepository extends JpaRepository<Invitado, Integer> {
    Optional<List<Invitado>> findByNombre(String nombreCriminal);
}
