package com.gimnasio.servicio;

import com.gimnasio.modelo.InventarioEquipo;
import java.util.ArrayList;
import java.util.List;

public class ServicioInventario {

    private List<InventarioEquipo> equipos;

    public ServicioInventario() {
        equipos = new ArrayList<>();
    }

    public void registrarEquipo(InventarioEquipo equipo) {
        equipos.add(equipo);
    }

    public List<InventarioEquipo> obtenerEquipos() {
        return equipos;
    }
}