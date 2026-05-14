package com.gimnasio.modelo;

/**
 * Clase Rutina.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * relacionada con las rutinas.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 * 
 * Esta clase NO implementa interfaces
 * porque no necesita:
 * 
 * - Reservar
 * - Evaluar
 * - Mantener
 * - Inscribir
 */
public class Rutina {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idRutina;
    private String nombreRutina;
    private String objetivo;
    private String dificultad;
    private int duracionSemanas;

    // Relación con Entrenador
    private Entrenador entrenador;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Rutina(int idRutina,
                  String nombreRutina,
                  String objetivo,
                  String dificultad,
                  int duracionSemanas,
                  Entrenador entrenador) {

        this.idRutina = idRutina;
        this.nombreRutina = nombreRutina;
        this.objetivo = objetivo;
        this.dificultad = dificultad;
        this.duracionSemanas = duracionSemanas;
        this.entrenador = entrenador;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna ID de la rutina
    public int getIdRutina() {
        return idRutina;
    }

    // Retorna nombre de la rutina
    public String getNombreRutina() {
        return nombreRutina;
    }

    // Retorna dificultad
    public String getDificultad() {
        return dificultad;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar objetivo
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    // Permite modificar dificultad
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Simula clonación de rutina.
     */
    public Rutina clonarRutina() {

        return new Rutina(
                idRutina,
                nombreRutina,
                objetivo,
                dificultad,
                duracionSemanas,
                entrenador
        );
    }

    /**
     * Simula asignación de rutina
     * a un cliente.
     */
    public void asignarRutinaCliente(int idCliente) {

        System.out.println(
                "Rutina asignada al cliente: "
                        + idCliente);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "Rutina: " + nombreRutina + "\n"
                + "  Objetivo: " + objetivo + "\n"
                + "  Dificultad: " + dificultad + "\n"
                + "  Duración: " + duracionSemanas + " semanas\n"
                + "  Entrenador: " + entrenador.getNombreCompleto();
    }
}
