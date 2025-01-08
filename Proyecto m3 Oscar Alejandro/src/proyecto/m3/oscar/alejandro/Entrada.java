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
public class Entrada {
    private int compradas;
    private Date fecha;
    private String tipoEntrada;
    private float precio;
    private String nomComprador;
    private int descuento;

    public int getCompradas() {
        return compradas;
    }

    public void setCompradas(int compradas) {
        this.compradas = compradas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNomComprador() {
        return nomComprador;
    }

    public void setNomComprador(String nomComprador) {
        this.nomComprador = nomComprador;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Entrada(int compradas, Date fecha, String tipoEntrada, float precio, String nomComprador, int descuento) {
        this.compradas = compradas;
        this.fecha = fecha;
        this.tipoEntrada = tipoEntrada;
        this.precio = precio;
        this.nomComprador = nomComprador;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entrada{");
        sb.append("compradas=").append(compradas);
        sb.append(", fecha=").append(fecha);
        sb.append(", tipoEntrada=").append(tipoEntrada);
        sb.append(", precio=").append(precio);
        sb.append(", nomComprador=").append(nomComprador);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }
    
    
    public void totalVendido() {
        System.out.println("Total vendido: " + (compradas * precio));
    }

    public void calcularCuantasPersonasHay() {
        System.out.println("Número de personas: " + compradas);
    }
}
