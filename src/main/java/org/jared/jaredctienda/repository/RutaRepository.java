package org.jared.jaredctienda.repository;

import java.util.List;

import org.jared.jaredctienda.domain.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RutaRepository extends JpaRepository<Ruta, Integer> {
    List<Ruta> findAllByOrderByRequiereRolAsc();
}
