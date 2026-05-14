package com.gimnasio.interfaces;

/**
 * Interfaz Evaluable.
 * 
 * DIP:
 * Las clases dependen de esta abstracción
 * y no de implementaciones concretas.
 * 
 * ISP:
 * Solo las clases que necesitan evaluarse
 * implementarán esta interfaz.
 */
public interface Evaluable {

    /**
     * Realiza una evaluación.
     */
    void evaluar();
}