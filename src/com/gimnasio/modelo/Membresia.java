package com.gimnasio.modelo;

import java.util.Date;

/**
 * Clase Membresia.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * relacionada con las membresías.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 */
public class Membresia {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idMembresia;
    private String codigo;
    private String nombrePlan;
    private int duracionMeses;
    private double precio;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Membresia(int idMembresia,
                     String codigo,
                     String nombrePlan,
                     int duracionMeses,
                     double precio) {

        this.idMembresia = idMembresia;
        this.codigo = codigo;
        this.nombrePlan = nombrePlan;
        this.duracionMeses = duracionMeses;
        this.precio = precio;
    }

    // =========================
    // GETTERS
    // =========================

    public Membresia(int i, String string, int j, int k, boolean b, Cliente cliente1) {
        //TODO Auto-generated constructor stub
    }

    // Retorna ID de la membresía
    public int getIdMembresia() {
        return idMembresia;
    }

    // Retorna el código de la membresía
    public String getCodigo() {
        return codigo;
    }

    // Retorna el nombre del plan
    public String getNombrePlan() {
        return nombrePlan;
    }

    // Retorna la duración en meses
    public int getDuracionMeses() {
        return duracionMeses;
    }

    // Retorna el precio de la membresía
    public double getPrecio() {
        return precio;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar el precio
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Calcula la fecha de renovación de la membresía.
     */
    public Date calcularFechaRenovacion() {
        Date fechaActual = new Date();
        long milisegundosPorMes = 30L * 24 * 60 * 60 * 1000;
        return new Date(fechaActual.getTime() + duracionMeses * milisegundosPorMes);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {
        return "Membresia{" +
                "idMembresia=" + idMembresia +
                ", codigo='" + codigo + '\'' +
                ", nombrePlan='" + nombrePlan + '\'' +
                ", duracionMeses=" + duracionMeses +
                ", precio=" + precio +
                '}';
    }

    public String getTipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipo'");
    }
}
