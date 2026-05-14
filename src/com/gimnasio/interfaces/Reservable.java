package com.gimnasio.interfaces;

/**
 * Interfaz Reservable.
 * 
 * DIP:
 * Las clases dependen de esta abstracción
 * para gestionar reservas.
 * 
 * ISP:
 * Solo las clases que pueden reservarse
 * implementan esta interfaz.
 */
public interface Reservable {

    /**
     * Realiza una reserva.
     */
    void reservar();
}
