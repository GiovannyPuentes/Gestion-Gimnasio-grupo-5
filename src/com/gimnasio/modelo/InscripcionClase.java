package com.gimnasio.modelo;

import com.gimnasio.interfaces.Inscribible;
import com.gimnasio.interfaces.Reservable;

/**
 * Clase InscripcionClase.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar las inscripciones
 * de clientes a clases grupales.
 * 
 * ISP:
 * Implementa solamente interfaces
 * relacionadas con su responsabilidad:
 * 
 * - Inscribible
 * - Reservable
 * 
 * OCP:
 * Puede extenderse agregando nuevas
 * funcionalidades sin modificar
 * la estructura principal.
 */
public class InscripcionClase implements Inscribible, Reservable {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idInscripcion;
    private String fecha;
    private String hora;
    private String estadoAsistencia;

    // Relaciones
    private Cliente cliente;
    private ClaseGrupal claseGrupal;

    // =========================
    // CONSTRUCTOR
    // =========================

    public InscripcionClase(int idInscripcion,
                            String fecha,
                            String hora,
                            String estadoAsistencia,
                            Cliente cliente,
                            ClaseGrupal claseGrupal) {

        this.idInscripcion = idInscripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoAsistencia = estadoAsistencia;
        this.cliente = cliente;
        this.claseGrupal = claseGrupal;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna el ID
    public int getIdInscripcion() {
        return idInscripcion;
    }

    // Retorna la fecha de inscripción
    public String getFecha() {
        return fecha;
    }

    // Retorna la hora de inscripción
    public String getHora() {
        return hora;
    }

    // Retorna el estado de asistencia
    public String getEstadoAsistencia() {
        return estadoAsistencia;
    }

    // Retorna el cliente asociado
    public Cliente getCliente() {
        return cliente;
    }

    // Retorna la clase grupal asociada
    public ClaseGrupal getClaseGrupal() {
        return claseGrupal;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar estado
    public void setEstadoAsistencia(String estado) {
        this.estadoAsistencia = estado;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Simula confirmación de cupo.
     */
    public void confirmarCupo() {

        System.out.println(
                "Cupo confirmado para la clase.");
    }

    // =========================
    // INTERFAZ INSCRIBIBLE
    // =========================

    /**
     * Implementación de Inscribible.
     * 
     * ISP:
     * La clase implementa únicamente
     * comportamientos necesarios.
     */
    @Override
    public void inscribir() {

        System.out.println(
                "Cliente inscrito correctamente.");
    }

    // =========================
    // INTERFAZ RESERVABLE
    // =========================

    /**
     * Implementación de Reservable.
     */
    @Override
    public void reservar() {

        System.out.println(
                "Reserva realizada correctamente.");
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "InscripcionClase{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", estadoAsistencia='" + estadoAsistencia + '\'' +
                '}';
    }
}