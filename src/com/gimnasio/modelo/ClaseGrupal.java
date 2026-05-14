package com.gimnasio.modelo;

import com.gimnasio.interfaces.Reservable;

/**
 * Clase ClaseGrupal.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * y comportamiento de las clases grupales.
 * 
 * ISP:
 * Implementa solamente la interfaz
 * Reservable porque una clase grupal
 * puede ser reservada por clientes.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 */
public class ClaseGrupal implements Reservable {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idClase;
    private String nombre;
    private int capacidadMax;
    private String intensidad;
    private String nombreSalon;
    private double areaMetrosCuadrados;
    private boolean tieneSonido;
    private boolean estadoDisponible;

    // =========================
    // CONSTRUCTOR
    // =========================

    public ClaseGrupal(int idClase,
                       String nombre,
                       int capacidadMax,
                       String intensidad,
                       String nombreSalon,
                       double areaMetrosCuadrados,
                       boolean tieneSonido,
                       boolean estadoDisponible) {

        this.idClase = idClase;
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.intensidad = intensidad;
        this.nombreSalon = nombreSalon;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.tieneSonido = tieneSonido;
        this.estadoDisponible = estadoDisponible;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna el ID de la clase
    public int getIdClase() {
        return idClase;
    }

    // Retorna el nombre
    public String getNombre() {
        return nombre;
    }

    // Retorna la capacidad máxima
    public int getCapacidadMax() {
        return capacidadMax;
    }

    // Retorna la intensidad
    public String getIntensidad() {
        return intensidad;
    }

    // Retorna el nombre del salón
    public String getNombreSalon() {
        return nombreSalon;
    }

    // Retorna el área en metros cuadrados
    public double getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    // Retorna si tiene sonido
    public boolean isTieneSonido() {
        return tieneSonido;
    }

    // Retorna si está disponible
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Permite modificar capacidad máxima
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    // Permite modificar intensidad
    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Verifica los cupos disponibles.
     */
    public int verificarCuposDisponibles() {

        return capacidadMax;
    }

    /**
     * Verifica disponibilidad del salón.
     */
    public boolean verificarDisponibilidad() {

        return estadoDisponible;
    }

    /**
     * Simula asignación de salón.
     */
    public void asignarSalon(String nombreSalon) {

        this.nombreSalon = nombreSalon;

        System.out.println(
                "Salón asignado: " + nombreSalon);
    }

    // =========================
    // INTERFAZ RESERVABLE
    // =========================

    /**
     * Implementación de la interfaz Reservable.
     * 
     * ISP:
     * ClaseGrupal implementa únicamente
     * comportamientos que realmente necesita.
     */
    @Override
    public void reservar() {

        System.out.println(
                "Clase grupal reservada correctamente.");
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "ClaseGrupal{" +
                "nombre='" + nombre + '\'' +
                ", intensidad='" + intensidad + '\'' +
                ", capacidadMax=" + capacidadMax +
                '}';
    }
}