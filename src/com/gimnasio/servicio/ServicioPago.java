package com.gimnasio.servicio;

import com.gimnasio.modelo.Pago;
import java.util.ArrayList;
import java.util.List;

public class ServicioPago {

    private List<Pago> pagos;

    public ServicioPago() {
        pagos = new ArrayList<>();
    }

    public void registrarPago(Pago pago) {
        pagos.add(pago);
    }

    public List<Pago> obtenerPagos() {
        return pagos;
    }
}