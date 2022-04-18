package com.crimen.crimen.service;


import com.crimen.crimen.model.Invitado;

import java.util.List;
import java.util.Optional;

public interface InvitadoService {
    Optional<List<Invitado>> getInvitadoPorNombre();
    List<Invitado> getAllInvitados();
}
