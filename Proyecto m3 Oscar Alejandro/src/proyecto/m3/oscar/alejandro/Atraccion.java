/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.m3.oscar.alejandro;

import java.util.Date;

/**
 *
 * @author oscarfabrod
 */
public class Atraccion {
    private String nombre;
    private String tematica;
    private float alturaMinima;
    private int anoCreacion;
    private Date ultimaReparacion;
    private String material;
    private float duracion;
    private float gastos;
    private int numUsos;
    private int antiguedad;
    private float fuerzaG;
    private float altura;
    private float distancia;
    private int coste;

    public Atraccion(String nombre, String tematica, float alturaMinima, int anoCreacion, Date ultimaReparacion,
                     String material, float duracion, float gastos, int numUsos, int antiguedad, float fuerzaG,
                     float altura, float distancia, int coste) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.alturaMinima = alturaMinima;
        this.anoCreacion = anoCreacion;
        this.ultimaReparacion = ultimaReparacion;
        this.material = material;
        this.duracion = duracion;
        this.gastos = gastos;
        this.numUsos = numUsos;
        this.antiguedad = antiguedad;
        this.fuerzaG = fuerzaG;
        this.altura = altura;
        this.distancia = distancia;
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public float getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(float alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public Date getUltimaReparacion() {
        return ultimaReparacion;
    }

    public void setUltimaReparacion(Date ultimaReparacion) {
        this.ultimaReparacion = ultimaReparacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public int getNumUsos() {
        return numUsos;
    }

    public void setNumUsos(int numUsos) {
        this.numUsos = numUsos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getFuerzaG() {
        return fuerzaG;
    }

    public void setFuerzaG(float fuerzaG) {
        this.fuerzaG = fuerzaG;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public void calcularProximoMantenimiento() {
        System.out.println("Próximo mantenimiento en 6 meses.");
    }

    public void calcularCosteAno() {
        System.out.println("Coste anual: " + (gastos * 12));
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", tematica='" + tematica + '\'' +
                ", alturaMinima=" + alturaMinima +
                '}';
    }
}
