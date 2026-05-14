package com.gimnasio.modelo;

/**
 * Clase Pago.
 * 
 * SRP:
 * Esta clase se encarga únicamente
 * de gestionar la información
 * y operaciones relacionadas con pagos.
 * 
 * OCP:
 * La clase puede extenderse agregando
 * nuevas funcionalidades sin modificar
 * su estructura principal.
 * 
 * Esta clase NO implementa interfaces
 * porque no necesita:
 * 
 * - Reservar
 * - Evaluar
 * - Mantener
 * - Inscribir
 */
public class Pago {

    // =========================
    // ATRIBUTOS
    // =========================

    private int idPago;
    private String nroFactura;
    private double monto;
    private String fechaPago;
    private String metodoPago;
    private String estado;

    // Relación con Cliente
    private Cliente cliente;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Pago(int idPago,
                String nroFactura,
                double monto,
                String fechaPago,
                String metodoPago,
                String estado,
                Cliente cliente) {

        this.idPago = idPago;
        this.nroFactura = nroFactura;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.cliente = cliente;
    }

    // =========================
    // GETTERS
    // =========================

    // Retorna ID del pago
    public int getIdPago() {
        return idPago;
    }

    // Retorna número de factura
    public String getNroFactura() {
        return nroFactura;
    }

    // Retorna el monto del pago
    public double getMonto() {
        return monto;
    }

    // Retorna la fecha del pago
    public String getFechaPago() {
        return fechaPago;
    }
    
    // Retorna el método de pago
    public String getMetodoPago() {
        return metodoPago;
    }

    // Retorna el cliente asociado
    public Cliente getCliente() {
        return cliente;
    }

    // Retorna estado
    public String getEstado() {
        return estado;
    }

    // =========================
    // SETTERS
    // =========================

    // Permite modificar método de pago
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    // =========================
    // MÉTODOS PROPIOS
    // =========================

    /**
     * Simula procesamiento de transacción.
     */
    public boolean procesarTransaccion() {

        estado = "Pagado";

        System.out.println(
                "Transacción procesada correctamente.");

        return true;
    }

    /**
     * Simula anulación de factura.
     */
    public void anularFactura() {

        estado = "Anulado";

        System.out.println(
                "Factura anulada correctamente.");
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "Pago{" +
                "nroFactura='" + nroFactura + '\'' +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
}