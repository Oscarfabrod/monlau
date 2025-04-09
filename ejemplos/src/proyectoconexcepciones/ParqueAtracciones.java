import java.util.ArrayList;
import java.util.Date;
import proyecto.m3.oscar.alejandro.Atraccion;
import proyecto.m3.oscar.alejandro.Cliente;
import proyecto.m3.oscar.alejandro.Empleado;
import proyecto.m3.oscar.alejandro.Entrada;
import proyecto.m3.oscar.alejandro.Socio;

// Excepción personalizada para ParqueAtracciones
class ParqueAtraccionesException extends Exception {
    public ParqueAtraccionesException(String mensaje) {
        super(mensaje);
    }
}

// Clase principal ParqueAtracciones
public class ParqueAtracciones {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private ArrayList<Atraccion> atracciones;
    private ArrayList<Empleado> empleados;
    private ArrayList<Socio> socios;
    private ArrayList<Entrada> entradas;
    private ArrayList<Cliente> clientes;

    public ParqueAtracciones(String nombre, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.atracciones = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }
    
    public void agregarEntrada(Entrada entrada) throws ParqueAtraccionesException {
        if (clientes.size() + socios.size() >= capacidad) {
            throw new ParqueAtraccionesException("Capacidad máxima alcanzada. No se pueden agregar más entradas.");
        }
        entradas.add(entrada);
    }

    public void listaAtraccion() {
        for (Atraccion atraccion : atracciones) {
            System.out.println(atraccion);
        }
    }

    @Override
    public String toString() {
        return "ParqueAtracciones{"
                + "nombre='" + nombre + '\''
                + ", ubicacion='" + ubicacion + '\''
                + ", capacidad=" + capacidad
                + '}';
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }
}
