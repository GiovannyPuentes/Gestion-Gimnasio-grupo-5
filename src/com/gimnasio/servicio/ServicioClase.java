package com.gimnasio.servicio;

import com.gimnasio.modelo.ClaseGrupal;
import java.util.ArrayList;
import java.util.List;

public class ServicioClase {

    private List<ClaseGrupal> clases;

    public ServicioClase() {
        clases = new ArrayList<>();
    }

    public void registrarClase(ClaseGrupal claseGrupal) {
        clases.add(claseGrupal);
    }

    public List<ClaseGrupal> obtenerClases() {
        return clases;
    }
}