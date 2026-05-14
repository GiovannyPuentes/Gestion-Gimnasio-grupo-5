package com.gimnasio.modelo;

/**
 * Clase abstracta Persona.
 * 
 * SRP: se encarga únicamente de manejar
 * la información básica de una persona.
 * 
 * OCP y LSP: permite que clases como
 * Cliente y Entrenador hereden y extiendan
 * su comportamiento sin modificar esta clase.
 */
public abstract class Persona {

    // Atributos comunes para todas las personas
    protected int idPersona;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;
    protected String celular;

    // Constructor para inicializar los atributos
    public Persona(int idPersona, String nombre, String apellidos,
                   String dni, String email, String celular) {

        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.celular = celular;
    }

    // Retorna el ID de la persona
    public int getIdPersona() {
        return idPersona;
    }

    // Retorna el nombre completo
    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    // Retorna el documento de identidad
    public String getDni() {
        return dni;
    }

    // Retorna el correo electrónico
    public String getEmail() {
        return email;
    }

    // Retorna el celular
    public String getCelular() {
        return celular;
    }

    // Permite actualizar el correo
    public void setEmail(String email) {
        this.email = email;
    }

    // Permite actualizar el celular
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método abstracto que cada subclase
     * debe implementar según su comportamiento.
     */
    public abstract void mostrarInformacion();
}