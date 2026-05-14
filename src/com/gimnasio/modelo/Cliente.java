package com.gimnasio.modelo;

import com.gimnasio.interfaces.Inscribible;

/**
 * Clase Cliente que hereda de Persona.
 * 
 * OCP y LSP:
 * Cliente extiende Persona reutilizando
 * atributos y comportamientos sin modificar
 * la clase padre.
 * 
 * ISP:
 * Implementa únicamente la interfaz
 * Inscribible porque un cliente puede
 * inscribirse a clases del gimnasio.
 */
public class Cliente extends Persona implements Inscribible {

    // Atributos propios del cliente
    private int idCliente;
    private String nroSocio;
    private String fechaAfiliacion;
    private boolean estadoActivo;
    private String huellaDigital;

    // Constructor
    public Cliente(int idPersona, String nombre, String apellidos,
                   String dni, String email, String celular,
                   int idCliente, String nroSocio,
                   String fechaAfiliacion,
                   boolean estadoActivo,
                   String huellaDigital) {

        // Llamada al constructor padre
        super(idPersona, nombre, apellidos, dni, email, celular);

        this.idCliente = idCliente;
        this.nroSocio = nroSocio;
        this.fechaAfiliacion = fechaAfiliacion;
        this.estadoActivo = estadoActivo;
        this.huellaDigital = huellaDigital;
    }

    // Retorna el ID del cliente
    public int getIdCliente() {
        return idCliente;
    }

    // Retorna el número de socio
    public String getNroSocio() {
        return nroSocio;
    }

    // Retorna la fecha de afiliación
    public String getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    // Retorna la huella digital
    public String getHuellaDigital() {
        return huellaDigital;
    }

    // Verifica si el cliente está activo
    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    // Permite modificar el estado
    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    // Simula validación de acceso
    public boolean validarAcceso() {
        return estadoActivo;
    }

    /**
     * Implementación del método abstracto
     * heredado de Persona.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Socio: " + nroSocio + " | Afiliación: " + fechaAfiliacion);
        System.out.println("DNI: " + getDni() + " | Celular: " + getCelular());
        System.out.println("Correo: " + getEmail() + " | Activo: " + (estadoActivo ? "Sí" : "No"));
    }

    /**
     * Implementación de la interfaz Inscribible.
     * ISP: Cliente solo implementa comportamientos
     * que realmente necesita.
     */
    @Override
    public void inscribir() {
        System.out.println("Cliente inscrito correctamente.");
    }
}