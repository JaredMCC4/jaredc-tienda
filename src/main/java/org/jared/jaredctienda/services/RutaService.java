package org.jared.jaredctienda.services;


import java.util.List;

import org.jared.jaredctienda.domain.Ruta;
import org.jared.jaredctienda.repository.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RutaService {

    @Autowired
    private RutaRepository rutaRepository;

    public List<Ruta> getRutas() {
        return rutaRepository.findAllByOrderByRequiereRolAsc();
    }

}
