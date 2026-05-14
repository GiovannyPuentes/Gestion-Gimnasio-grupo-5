package com.gimnasio.modelo;

import com.gimnasio.interfaces.Evaluable;

import java.util.Date;

/**
 * Clase EvaluacionFisica.
 * 
 * SRP:
 * Gestiona únicamente la información
 * relacionada con la evaluación física
 * de un cliente.
 * 
 * ISP:
 * Implementa solamente la interfaz
 * Evaluable porque necesita generar
 * evaluaciones y recomendaciones.
 */
public class EvaluacionFisica implements Evaluable {

    // Atributos de la evaluación
    private int idEvaluacion;
    private Date fechaEvaluacion;
    private double pesoKg;
    private double porcentajeGrasa;
    private double imc;

    // Relación con Cliente
    private Cliente cliente;

    // Constructor
    public EvaluacionFisica(int idEvaluacion,
                            Date fechaEvaluacion,
                            double pesoKg,
                            double porcentajeGrasa,
                            double imc,
                            Cliente cliente) {

        this.idEvaluacion = idEvaluacion;
        this.fechaEvaluacion = fechaEvaluacion;
        this.pesoKg = pesoKg;
        this.porcentajeGrasa = porcentajeGrasa;
        this.imc = imc;
        this.cliente = cliente;
    }

    // Retorna el ID
    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    // Retorna la fecha de evaluación
    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    // Retorna el peso en kilogramos
    public double getPesoKg() {
        return pesoKg;
    }

    // Retorna el porcentaje de grasa corporal
    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    // Retorna el cliente evaluado
    public Cliente getCliente() {
        return cliente;
    }

    // Retorna el IMC
    public double getImc() {
        return imc;
    }

    // Permite modificar el peso
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    /**
     * Implementación de la interfaz Evaluable.
     */
    @Override
    public void evaluar() {
        System.out.println("Evaluación física realizada.");
    }

    /**
     * Genera recomendaciones según IMC.
     */
    public String generarRecomendacion() {

        if(imc >= 25) {
            return "Se recomienda rutina cardiovascular.";
        }

        return "Estado físico adecuado.";
    }

    @Override
    public String toString() {
        return "Evaluación Física | IMC: " + imc;
    }
}
