package com.gimnasio.modelo;

/**
 * Clase Ejercicio.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * relacionada con los ejercicios.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevos tipos de ejercicios sin modificar
 * la estructura principal.
 * 
 * Esta clase NO implementa interfaces
 * porque sus responsabilidades no requieren:
 * 
 * - Reservar
 * - Inscribir
 * - Evaluar
 * - Mantener
 */
public class Ejercicio {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idEjercicio;
    private String nombre;
    private String musculoPrincipal;
    private int series;
    private int repeticiones;
    private int descansoSeg;

    // Relación con Rutina
    private Rutina rutina;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Ejercicio(int idEjercicio,
                     String nombre,
                     String musculoPrincipal,
                     int series,
                     int repeticiones,
                     int descansoSeg,
                     Rutina rutina) {

        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.musculoPrincipal = musculoPrincipal;
        this.series = series;
        this.repeticiones = repeticiones;
        this.descansoSeg = descansoSeg;
        this.rutina = rutina;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna el ID del ejercicio
    public int getIdEjercicio() {
        return idEjercicio;
    }

    // Retorna el nombre del ejercicio
    public String getNombre() {
        return nombre;
    }

    // Retorna el músculo principal
    public String getMusculoPrincipal() {
        return musculoPrincipal;
    }

    // Retorna las series
    public int getSeries() {
        return series;
    }

    // Retorna las repeticiones
    public int getRepeticiones() {
        return repeticiones;
    }

    // Retorna el descanso en segundos
    public int getDescansoSeg() {
        return descansoSeg;
    }

    // Retorna la rutina asociada
    public Rutina getRutina() {
        return rutina;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar las series
    public void setSeries(int series) {
        this.series = series;
    }

    // Permite modificar las repeticiones
    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    // Permite modificar tiempo de descanso
    public void setDescansoSeg(int descansoSeg) {
        this.descansoSeg = descansoSeg;
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "Ejercicio: " + nombre + "\n"
                + "  Músculo principal: " + musculoPrincipal + "\n"
                + "  Series x repeticiones: " + series + " x " + repeticiones + "\n"
                + "  Descanso: " + descansoSeg + " seg\n"
                + "  Rutina: " + rutina.getNombreRutina();
    }
}