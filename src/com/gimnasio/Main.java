package com.gimnasio;

import com.gimnasio.modelo.*;
import com.gimnasio.servicio.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // =====================================================
        // FORMATO DINERO
        // =====================================================

        DecimalFormat formatoDinero =
                new DecimalFormat("$###,###.##");

        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║           SISTEMA DE GESTIÓN GIMNASIO               ║");
        System.out.println("║              ENTREGA 2 - PRINCIPIOS SOLID           ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        // =====================================================
        // SERVICIOS
        // =====================================================

        ServicioCliente servicioCliente =
                new ServicioCliente();

        ServicioMembresia servicioMembresia =
                new ServicioMembresia();

        ServicioRutina servicioRutina =
                new ServicioRutina();

        ServicioClase servicioClase =
                new ServicioClase();

        ServicioPago servicioPago =
                new ServicioPago();

        ServicioInventario servicioInventario =
                new ServicioInventario();

        // =====================================================
        // GIMNASIO
        // =====================================================

        Gimnasio gimnasio = new Gimnasio(
                1,
                "Titan Fitness Center",
                "901456789",
                "Av. Principal #45-10",
                "3204567890"
        );

        System.out.println("\n══════════════════════════════════════");
        System.out.println("         GIMNASIO REGISTRADO");
        System.out.println("══════════════════════════════════════");

        System.out.println(gimnasio);

        // =====================================================
        // CLIENTES
        // =====================================================

        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(
                1,
                "Juan",
                "Pérez",
                "123456789",
                "juan@gmail.com",
                "3011111111",
                101,
                "SOC-001",
                "2025-05-11",
                true,
                "Huella01"
        );

        Cliente cliente2 = new Cliente(
                2,
                "Laura",
                "Martínez",
                "987654321",
                "laura@gmail.com",
                "3022222222",
                102,
                "SOC-002",
                "2025-05-11",
                true,
                "Huella02"
        );

        Cliente cliente3 = new Cliente(
                3,
                "Camilo",
                "Ramírez",
                "456123789",
                "camilo@gmail.com",
                "3033333333",
                103,
                "SOC-003",
                "2025-05-11",
                true,
                "Huella03"
        );

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // REGISTRO CLIENTES

        System.out.println("\n══════════════════════════════════════");
        System.out.println("       CLIENTES REGISTRADOS");
        System.out.println("══════════════════════════════════════");

        servicioCliente.registrarCliente(cliente1);
        servicioCliente.registrarCliente(cliente2);
        servicioCliente.registrarCliente(cliente3);

        int contadorCliente = 1;

        for (Cliente c : clientes) {

            System.out.println("\n════════════════════════════");
            System.out.println("       CLIENTE #" + contadorCliente);
            System.out.println("════════════════════════════");

            c.mostrarInformacion();

            contadorCliente++;
        }

        // =====================================================
        // ENTRENADORES
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("    ENTRENADORES REGISTRADOS");
        System.out.println("══════════════════════════════════════");

        List<Entrenador> entrenadores = new ArrayList<>();

        Entrenador entrenador1 = new Entrenador(
                1,
                "Sebastián",
                "Gómez",
                "111222333",
                "sebastian@gym.com",
                "3100000001",
                201,
                "ENT-001",
                "Entrenamiento Funcional",
                "Mañana",
                3200000
        );

        Entrenador entrenador2 = new Entrenador(
                2,
                "Valentina",
                "Rojas",
                "444555666",
                "valentina@gym.com",
                "3100000002",
                202,
                "ENT-002",
                "Biomecánica Deportiva",
                "Tarde",
                3500000
        );

        Entrenador entrenador3 = new Entrenador(
                3,
                "Andrés",
                "Torres",
                "777888999",
                "andres@gym.com",
                "3100000003",
                203,
                "ENT-003",
                "Hipertrofia y Fuerza",
                "Noche",
                4000000
        );

        entrenadores.add(entrenador1);
        entrenadores.add(entrenador2);
        entrenadores.add(entrenador3);

        int contadorEntrenador = 1;

        for (Entrenador e : entrenadores) {

            System.out.println("\n════════════════════════════");
            System.out.println("     ENTRENADOR #" + contadorEntrenador);
            System.out.println("════════════════════════════");

            e.mostrarInformacion();

            contadorEntrenador++;
        }

        // =====================================================
        // MEMBRESÍAS
        // =====================================================

        Membresia basica = new Membresia(
                1,
                "Plan Básico",
                85000,
                1,
                true,
                cliente1
        );

        Membresia estandar = new Membresia(
                2,
                "Plan Estándar",
                350000,
                3,
                true,
                cliente2
        );

        Membresia premium = new Membresia(
                3,
                "Plan Premium Elite",
                4800000,
                12,
                true,
                cliente3
        );

        servicioMembresia.registrarMembresia(basica);
        servicioMembresia.registrarMembresia(estandar);
        servicioMembresia.registrarMembresia(premium);

        System.out.println("\n══════════════════════════════════════");
        System.out.println("        PLANES DE MEMBRESÍA");
        System.out.println("══════════════════════════════════════");

        System.out.println("\n════════════════════════════");
        System.out.println("        PLAN BÁSICO");
        System.out.println("════════════════════════════");
        System.out.println("Duración: 1 mes");
        System.out.println("Precio: "
                + formatoDinero.format(85000));
        System.out.println("Incluye:");
        System.out.println("- Área cardiovascular");
        System.out.println("- Máquinas convencionales");
        System.out.println("- Evaluación básica");

        System.out.println("\n════════════════════════════");
        System.out.println("       PLAN ESTÁNDAR");
        System.out.println("════════════════════════════");
        System.out.println("Duración: 3 meses");
        System.out.println("Precio: "
                + formatoDinero.format(350000));
        System.out.println("Incluye:");
        System.out.println("- Acceso completo");
        System.out.println("- Clases grupales");
        System.out.println("- Rutina personalizada");

        System.out.println("\n════════════════════════════");
        System.out.println("     PLAN PREMIUM ELITE");
        System.out.println("════════════════════════════");
        System.out.println("Duración: 12 meses");
        System.out.println("Precio: "
                + formatoDinero.format(4800000));
        System.out.println("Incluye:");
        System.out.println("- Entrenador personalizado");
        System.out.println("- Acceso VIP");
        System.out.println("- Todas las sedes");
        System.out.println("- Zona recovery");

        // =====================================================
        // RUTINAS
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("        RUTINAS DISPONIBLES");
        System.out.println("══════════════════════════════════════");

        Rutina rutina1 = new Rutina(
                1,
                "Hipertrofia Tren Inferior",
                "Desarrollo de glúteo y femoral",
                "Intermedio",
                12,
                entrenador1
        );

        Rutina rutina2 = new Rutina(
                2,
                "Push Pull Legs",
                "Ganancia de fuerza muscular",
                "Avanzado",
                16,
                entrenador2
        );

        Rutina rutina3 = new Rutina(
                3,
                "Definición Torso Superior",
                "Pecho, espalda y hombros",
                "Intermedio",
                10,
                entrenador3
        );

        servicioRutina.registrarRutina(rutina1);
        servicioRutina.registrarRutina(rutina2);
        servicioRutina.registrarRutina(rutina3);

        System.out.println("\n════════════════════════════");
        System.out.println("         RUTINA #1");
        System.out.println("════════════════════════════");
        System.out.println(rutina1);

        System.out.println("\n════════════════════════════");
        System.out.println("         RUTINA #2");
        System.out.println("════════════════════════════");
        System.out.println(rutina2);

        System.out.println("\n════════════════════════════");
        System.out.println("         RUTINA #3");
        System.out.println("════════════════════════════");
        System.out.println(rutina3);

        // =====================================================
        // CLASES GRUPALES
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("     CLASES GRUPALES DISPONIBLES");
        System.out.println("══════════════════════════════════════");

        ClaseGrupal crossfit = new ClaseGrupal(
                1,
                "CrossFit Extremo",
                25,
                "Alta",
                "Box Training",
                120.5,
                true,
                true
        );

        ClaseGrupal zumba = new ClaseGrupal(
                2,
                "Zumba Dance",
                30,
                "Media",
                "Salón Ritmos",
                95.0,
                true,
                true
        );

        ClaseGrupal funcional = new ClaseGrupal(
                3,
                "Entrenamiento Funcional",
                20,
                "Alta",
                "Zona Funcional",
                110.0,
                false,
                true
        );

        servicioClase.registrarClase(crossfit);
        servicioClase.registrarClase(zumba);
        servicioClase.registrarClase(funcional);

        System.out.println("\n════════════════════════════");
        System.out.println("      CLASES RESERVADAS");
        System.out.println("════════════════════════════");

        crossfit.reservar();
        zumba.reservar();
        funcional.reservar();

        System.out.println("\n════════════════════════════");
        System.out.println("      CLASE GRUPAL #1");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: CrossFit Extremo");
        System.out.println("Intensidad: Alta");
        System.out.println("Capacidad: 25 personas");
        System.out.println("Salón: Box Training");

        System.out.println("\n════════════════════════════");
        System.out.println("      CLASE GRUPAL #2");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: Zumba Dance");
        System.out.println("Intensidad: Media");
        System.out.println("Capacidad: 30 personas");
        System.out.println("Salón: Salón Ritmos");

        System.out.println("\n════════════════════════════");
        System.out.println("      CLASE GRUPAL #3");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: Entrenamiento Funcional");
        System.out.println("Intensidad: Alta");
        System.out.println("Capacidad: 20 personas");
        System.out.println("Salón: Zona Funcional");

        // =====================================================
        // PAGOS
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("        PAGOS REGISTRADOS");
        System.out.println("══════════════════════════════════════");

        Pago pago1 = new Pago(
                1,
                "FAC-001",
                85000,
                "10/05/2026",
                "Nequi",
                "Pendiente",
                cliente1
        );

        Pago pago2 = new Pago(
                2,
                "FAC-002",
                150000,
                "11/05/2026",
                "Tarjeta Débito",
                "Pendiente",
                cliente2
        );

        Pago pago3 = new Pago(
                3,
                "FAC-003",
                480000,
                "12/05/2026",
                "Tarjeta Crédito",
                "Pendiente",
                cliente3
        );

        servicioPago.registrarPago(pago1);
        servicioPago.registrarPago(pago2);
        servicioPago.registrarPago(pago3);

        System.out.println("\n════════════════════════════");
        System.out.println("    TRANSACCIONES");
        System.out.println("════════════════════════════");

        pago1.procesarTransaccion();
        pago2.procesarTransaccion();
        pago3.procesarTransaccion();

        System.out.println("\n════════════════════════════");
        System.out.println("         PAGO #1");
        System.out.println("════════════════════════════");
        System.out.println("Factura: FAC-001");
        System.out.println("Monto: "
                + formatoDinero.format(85000));
        System.out.println("Método: Nequi");
        System.out.println("Estado: Pagado");

        System.out.println("\n════════════════════════════");
        System.out.println("         PAGO #2");
        System.out.println("════════════════════════════");
        System.out.println("Factura: FAC-002");
        System.out.println("Monto: "
                + formatoDinero.format(150000));
        System.out.println("Método: Tarjeta Débito");
        System.out.println("Estado: Pagado");

        System.out.println("\n════════════════════════════");
        System.out.println("         PAGO #3");
        System.out.println("════════════════════════════");
        System.out.println("Factura: FAC-003");
        System.out.println("Monto: "
                + formatoDinero.format(480000));
        System.out.println("Método: Tarjeta Crédito");
        System.out.println("Estado: Pagado");

        // =====================================================
        // INVENTARIO
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("       INVENTARIO DE EQUIPOS");
        System.out.println("══════════════════════════════════════");

        InventarioEquipo equipo1 =
                new InventarioEquipo(
                        1,
                        "Caminadora LifeFitness",
                        "Cardio",
                        "Óptimo",
                        "2025-04-10",
                        gimnasio
                );

        InventarioEquipo equipo2 =
                new InventarioEquipo(
                        2,
                        "Prensa 45°",
                        "Pierna",
                        "En mantenimiento",
                        "2025-05-01",
                        gimnasio
                );

        InventarioEquipo equipo3 =
                new InventarioEquipo(
                        3,
                        "Polea Multifuncional",
                        "Espalda",
                        "Óptimo",
                        "2025-04-18",
                        gimnasio
                );

        servicioInventario.registrarEquipo(equipo1);
        servicioInventario.registrarEquipo(equipo2);
        servicioInventario.registrarEquipo(equipo3);

        System.out.println("\n════════════════════════════");
        System.out.println("   MANTENIMIENTO EQUIPOS");
        System.out.println("════════════════════════════");

        equipo1.realizarMantenimiento();
        equipo2.realizarMantenimiento();
        equipo3.realizarMantenimiento();

        // =====================================================
        // SEDES
        // =====================================================

        System.out.println("\n══════════════════════════════════════");
        System.out.println("        SEDES DISPONIBLES");
        System.out.println("══════════════════════════════════════");

        Sede sede1 = new Sede(
                1,
                "Sede Norte",
                "Cra 15 #20-30",
                "Neiva",
                "3101112233",
                true,
                gimnasio
        );

        Sede sede2 = new Sede(
                2,
                "Sede Centro",
                "Calle 8 #12-15",
                "Pitalito",
                "3104445566",
                true,
                gimnasio
        );

        Sede sede3 = new Sede(
                3,
                "Sede Premium",
                "Av. Los Fundadores #45-80",
                "Florencia",
                "3107778899",
                true,
                gimnasio
        );

        System.out.println("\n════════════════════════════");
        System.out.println("   MANTENIMIENTO SEDES");
        System.out.println("════════════════════════════");

        sede1.realizarMantenimiento();
        sede2.realizarMantenimiento();
        sede3.realizarMantenimiento();

        System.out.println("\n════════════════════════════");
        System.out.println("         SEDE #1");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: Sede Norte");
        System.out.println("Ciudad: Neiva");
        System.out.println("Dirección: Cra 15 #20-30");
        System.out.println("Teléfono: 3101112233");
        System.out.println("Estado: Operativa");

        System.out.println("\n════════════════════════════");
        System.out.println("         SEDE #2");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: Sede Centro");
        System.out.println("Ciudad: Pitalito");
        System.out.println("Dirección: Calle 8 #12-15");
        System.out.println("Teléfono: 3104445566");
        System.out.println("Estado: Operativa");

        System.out.println("\n════════════════════════════");
        System.out.println("         SEDE #3");
        System.out.println("════════════════════════════");
        System.out.println("Nombre: Sede Premium");
        System.out.println("Ciudad: Florencia");
        System.out.println("Dirección: Av. Los Fundadores #45-80");
        System.out.println("Teléfono: 3107778899");
        System.out.println("Estado: Operativa");

        // =====================================================
        // FINAL
        // =====================================================

        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║   DEMOSTRACIÓN EJECUTADA CON ÉXITO   ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}