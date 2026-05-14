package com.gimnasio.servicio;

import com.gimnasio.modelo.Rutina;
import java.util.ArrayList;
import java.util.List;

public class ServicioRutina {

    private List<Rutina> rutinas;

    public ServicioRutina() {
        rutinas = new ArrayList<>();
    }

    public void registrarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }
}