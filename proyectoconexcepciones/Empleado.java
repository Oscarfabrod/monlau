/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.m3.oscar.alejandro;

/**
 *
 * @author oscarfabrod
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int turno;
    private String atraccionVinculada;
    private boolean altaBaja;
    private float sueldo;
    private float ganancias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getAtraccionVinculada() {
        return atraccionVinculada;
    }

    public void setAtraccionVinculada(String atraccionVinculada) {
        this.atraccionVinculada = atraccionVinculada;
    }

    public boolean isAltaBaja() {
        return altaBaja;
    }

    public void setAltaBaja(boolean altaBaja) {
        this.altaBaja = altaBaja;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public Empleado(String nombre, String apellido, int turno, String atraccionVinculada, boolean altaBaja, float sueldo, float ganancias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
        this.atraccionVinculada = atraccionVinculada;
        this.altaBaja = altaBaja;
        this.sueldo = sueldo;
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", turno=").append(turno);
        sb.append(", atraccionVinculada=").append(atraccionVinculada);
        sb.append(", altaBaja=").append(altaBaja);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ganancias=").append(ganancias);
        sb.append('}');
        return sb.toString();
    }
    
    

    public void pagado() {
        System.out.println("Empleado pagado: " + sueldo);
    }

    public void costeTotalEmpleado() {
        System.out.println("Coste total del empleado: " + (sueldo * 12));
    }
}
