package com.gimnasio.modelo;

import com.gimnasio.interfaces.Mantenible;

/**
 * Clase InventarioEquipo.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * y mantenimiento de los equipos.
 * 
 * ISP:
 * Implementa solamente la interfaz
 * Mantenible porque los equipos
 * requieren mantenimiento.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 */
public class InventarioEquipo implements Mantenible {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idEquipo;
    private String nombreEquipo;
    private String tipoEquipo;
    private String estadoMantenimiento;
    private String fechaUltimaRevision;

    // Relación con Gimnasio
    private Gimnasio gimnasio;

    // =========================
    // CONSTRUCTOR
    // =========================

    public InventarioEquipo(int idEquipo,
                            String nombreEquipo,
                            String tipoEquipo,
                            String estadoMantenimiento,
                            String fechaUltimaRevision,
                            Gimnasio gimnasio) {

        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.tipoEquipo = tipoEquipo;
        this.estadoMantenimiento = estadoMantenimiento;
        this.fechaUltimaRevision = fechaUltimaRevision;
        this.gimnasio = gimnasio;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna ID del equipo
    public int getIdEquipo() {
        return idEquipo;
    }

    // Retorna el nombre del equipo
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    // Retorna el tipo de equipo
    public String getTipoEquipo() {
        return tipoEquipo;
    }

    // Retorna el estado de mantenimiento
    public String getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    // Retorna la fecha de última revisión
    public String getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    // Retorna el gimnasio asociado
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar estado
    public void setEstadoMantenimiento(String estadoMantenimiento) {
        this.estadoMantenimiento = estadoMantenimiento;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Simula programación de mantenimiento.
     */
    public void programarMantenimiento(String fecha) {

        this.fechaUltimaRevision = fecha;

        System.out.println(
                "Mantenimiento programado para: "
                        + fecha);
    }

    // =========================
    // INTERFAZ MANTENIBLE
    // =========================

    /**
     * Implementación de la interfaz Mantenible.
     * 
     * ISP:
     * La clase implementa únicamente
     * comportamientos necesarios.
     */
    @Override
    public void realizarMantenimiento() {

        estadoMantenimiento = "Mantenimiento realizado";

        System.out.println(
                "Mantenimiento realizado al equipo: "
                        + nombreEquipo);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "InventarioEquipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", estadoMantenimiento='" + estadoMantenimiento + '\'' +
                '}';
    }
}
