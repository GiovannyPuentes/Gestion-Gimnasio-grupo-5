package com.gimnasio.interfaces;

/**
 * Interfaz Mantenible.
 * 
 * DIP:
 * Permite trabajar mediante abstracciones
 * relacionadas con mantenimiento.
 * 
 * ISP:
 * Solo las clases que requieren
 * mantenimiento implementan esta interfaz.
 */
public interface Mantenible {

    /**
     * Realiza mantenimiento.
     */
    void realizarMantenimiento();
}