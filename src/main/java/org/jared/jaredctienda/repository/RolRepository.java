package org.jared.jaredctienda.repository;

import org.jared.jaredctienda.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    public Optional<Rol> findByRol(String rol);
}
