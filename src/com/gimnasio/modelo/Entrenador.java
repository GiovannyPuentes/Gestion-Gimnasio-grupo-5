package com.gimnasio.modelo;

/**
 * Clase Entrenador.
 *
 * SRP:
 * La clase administra únicamente
 * la información del entrenador.
 */
public class Entrenador extends Persona {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idEntrenador;
    private String codEmpleado;
    private String especialidad;
    private String turno;
    private double sueldo;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Entrenador(int idPersona,
                      String nombre,
                      String apellidos,
                      String dni,
                      String email,
                      String celular,
                      int idEntrenador,
                      String codEmpleado,
                      String especialidad,
                      String turno,
                      double sueldo) {

        // Herencia clase Persona
        super(idPersona, nombre, apellidos, dni, email, celular);

        this.idEntrenador = idEntrenador;
        this.codEmpleado = codEmpleado;
        this.especialidad = especialidad;
        this.turno = turno;
        this.sueldo = sueldo;
    }

    // =========================
    // GETTERS
    // =========================

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // =========================
    // SETTERS
    // =========================

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // =========================
    // MÉTODOS
    // =========================

    /**
     * OCP + LSP:
     * Sobrescribe comportamiento de Persona.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("ID Entrenador: " + idEntrenador);
        System.out.println("Código: " + codEmpleado);
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Turno: " + turno);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Correo: " + email);
        System.out.println("Celular: " + celular);
    }

    /**
     * Método del UML.
     */
    public void asignarRutina(int clienteId) {

        System.out.println(
                "  Rutina asignada al cliente ID: "
                        + clienteId
        );
    }

    @Override
    public String toString() {

        return "Entrenador{" +
                "idEntrenador=" + idEntrenador +
                ", codEmpleado='" + codEmpleado + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", turno='" + turno + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}