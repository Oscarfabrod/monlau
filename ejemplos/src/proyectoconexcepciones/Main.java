/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;
import proyecto.m3.oscar.alejandro.Atraccion; // Asegúrate de que el paquete esté configurado correctamente
import proyecto.m3.oscar.alejandro.Cliente;
import proyecto.m3.oscar.alejandro.Empleado;
import proyecto.m3.oscar.alejandro.Entrada;
import proyecto.m3.oscar.alejandro.Socio;

public class Main {
    public static void main(String[] args) {
        // Crear el parque de atracciones
        ParqueAtracciones parque = new ParqueAtracciones("Parque Mágico", "Ciudad Fantástica", 5000);

        // Crear y agregar atracciones
        Atraccion montanaRusa = new Atraccion(
            "Montaña Rusa",
            "Aventura",
            1.2f,
            2005,
            new Date(),
            "Metal",
            2.0f,
            100.0f,
            500,
            18,
            3.5f,
            30.0f,
            500.0f,
            20
        );
        parque.agregarAtraccion(montanaRusa);

        // Listar atracciones
        System.out.println("Lista de atracciones:");
        parque.listaAtraccion();

        // Crear y agregar empleados
        Empleado empleado1 = new Empleado(
            "Juan",
            "Pérez",
            1,
            "Montaña Rusa",
            true,
            1500.0f,
            18000.0f
        );
        
        parque.getEmpleados().add(empleado1);

        // Mostrar empleado
        System.out.println("Empleados:");
        System.out.println(empleado1);

        // Crear y agregar cliente
        Cliente cliente1 = new Cliente("Montaña Rusa", "María", 3, "Increíble experiencia", 5, "López");
        parque.getClientes().add(cliente1);

        // Mostrar cliente
        System.out.println("Clientes:");
        System.out.println(cliente1);

        // Crear y agregar socio
        Socio socio1 = new Socio(
            "Montaña Rusa",
            10,
            "Me encanta",
            5,
            "Maria",  
            "González",
            10.0f,
            new Date(),
            "Premium",
            5
        );
        parque.getSocios().add(socio1);

        // Mostrar socio
        System.out.println("Socios:");
        System.out.println(socio1);

        // Crear y agregar entrada
        Entrada entrada1 = new Entrada(3, new Date(), "General", 50.0f, "María López", 10);
        parque.getEntradas().add(entrada1);

        // Mostrar entrada
        System.out.println("Entradas:");
        System.out.println(entrada1);

        // Métodos adicionales
        montanaRusa.calcularProximoMantenimiento();
        montanaRusa.calcularCosteAno();

        empleado1.pagado();
        empleado1.costeTotalEmpleado();

        cliente1.rankingAtracciones();

        socio1.descuentoAntiguedad();
        socio1.regaloTiempo();

        // Información general del parque
        entrada1.totalVendido();
        entrada1.calcularCuantasPersonasHay();

        System.out.println("Información del Parque:");
        System.out.println(parque);
    }
}