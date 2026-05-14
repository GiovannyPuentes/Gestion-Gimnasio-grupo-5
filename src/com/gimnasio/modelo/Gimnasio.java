package com.gimnasio.modelo;

/**
 * Clase Gimnasio.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * general del gimnasio.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * la estructura principal.
 * 
 * Esta clase NO implementa interfaces
 * porque no necesita:
 * 
 * - Reservar
 * - Evaluar
 * - Inscribir
 * - Mantener
 */
public class Gimnasio {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idGimnasio;
    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Gimnasio(int idGimnasio,
                    String nombre,
                    String nit,
                    String direccion,
                    String telefono) {

        this.idGimnasio = idGimnasio;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna el ID del gimnasio
    public int getIdGimnasio() {
        return idGimnasio;
    }

    // Retorna el nombre del gimnasio
    public String getNombre() {
        return nombre;
    }

    // Retorna el NIT del gimnasio
    public String getNit() {
        return nit;
    }

    // Retorna la dirección del gimnasio
    public String getDireccion() {
        return direccion;
    }

    // Retorna el teléfono del gimnasio
    public String getTelefono() {
        return telefono;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar la dirección
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Simula el registro de ingreso
     * de un socio al gimnasio.
     */
    public void registrarIngreso(int socioId) {

        System.out.println(
                "Ingreso registrado para socio: "
                        + socioId);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "Gimnasio:\n"
                + "  Nombre: " + nombre + "\n"
                + "  NIT: " + nit + "\n"
                + "  Dirección: " + direccion + "\n"
                + "  Teléfono: " + telefono;
    }
}