package com.gimnasio.servicio;

import com.gimnasio.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ServicioCliente {

    private List<Cliente> clientes;

    public ServicioCliente() {
        clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }
}