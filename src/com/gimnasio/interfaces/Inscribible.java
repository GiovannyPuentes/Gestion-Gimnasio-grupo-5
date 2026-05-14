package com.gimnasio.interfaces;

/**
 * Interfaz Inscribible.
 * 
 * DIP:
 * Las clases dependen de abstracciones
 * y no de implementaciones concretas.
 * 
 * ISP:
 * Solo las clases relacionadas con
 * inscripciones implementan esta interfaz.
 */
public interface Inscribible {

    /**
     * Realiza una inscripción.
     */
    void inscribir();
}