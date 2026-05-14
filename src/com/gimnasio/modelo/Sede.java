package com.gimnasio.modelo;

import com.gimnasio.interfaces.Mantenible;

/**
 * Clase Sede.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * relacionada con las sedes del gimnasio.
 * 
 * ISP:
 * Implementa solamente la interfaz
 * Mantenible porque una sede
 * requiere mantenimiento.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 */
public class Sede implements Mantenible {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idSede;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private boolean estadoDisponible;

    // Relación con Gimnasio
    private Gimnasio gimnasio;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Sede(int idSede,
                String nombre,
                String direccion,
                String ciudad,
                String telefono,
                boolean estadoDisponible,
                Gimnasio gimnasio) {

        this.idSede = idSede;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.estadoDisponible = estadoDisponible;
        this.gimnasio = gimnasio;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna ID de la sede
    public int getIdSede() {
        return idSede;
    }

    // Retorna nombre
    public String getNombre() {
        return nombre;
    }

    // Retorna direccion
    public String getDireccion() {
        return direccion;
    }

    // Retorna ciudad
    public String getCiudad() {
        return ciudad;
    }

    // Retorna telefono
    public String getTelefono() {
        return telefono;
    }

    // Retorna si la sede está disponible
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    // Retorna el gimnasio asociado
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar dirección
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Permite modificar estado
    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Verifica disponibilidad de la sede.
     */
    public boolean verificarDisponibilidad() {

        return estadoDisponible;
    }

    /**
     * Simula apertura de sede.
     */
    public void abrirSede() {

        estadoDisponible = true;

        System.out.println(
                "Sede abierta correctamente.");
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

        System.out.println(
                "Mantenimiento realizado en la sede: "
                        + nombre);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "Sede{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
