package com.gimnasio.servicio;

import com.gimnasio.modelo.Membresia;
import java.util.ArrayList;
import java.util.List;

public class ServicioMembresia {

    private List<Membresia> membresias;

    public ServicioMembresia() {
        membresias = new ArrayList<>();
    }

    public void registrarMembresia(Membresia membresia) {
        membresias.add(membresia);
    }

    public List<Membresia> obtenerMembresias() {
        return membresias;
    }
}