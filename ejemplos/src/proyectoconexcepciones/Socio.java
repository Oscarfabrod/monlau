/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.m3.oscar.alejandro;

import java.util.Date;


public class Socio extends Cliente{
    private float descuento;
    private Date inicioSocio;
    private String tipoDeSocio;
    private int anosAntiguedad;

    

    

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Date getInicioSocio() {
        return inicioSocio;
    }

    public void setInicioSocio(Date inicioSocio) {
        this.inicioSocio = inicioSocio;
    }

    public String getTipoDeSocio() {
        return tipoDeSocio;
    }

    public void setTipoDeSocio(String tipoDeSocio) {
        this.tipoDeSocio = tipoDeSocio;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }

    public Socio(String atraccionMontada, int cuantasVeces, String opinion, int valoracion, String nombre, String apellido, float descuento, Date inicioSocio, String tipoDeSocio, int anosAntiguedad) {
        super(atraccionMontada, nombre, cuantasVeces, opinion, valoracion, apellido);
        this.descuento = descuento;
        this.inicioSocio = inicioSocio;
        this.tipoDeSocio = tipoDeSocio;
        this.anosAntiguedad = anosAntiguedad;
    }

    public void descuentoAntiguedad() {
        System.out.println("Descuento aplicado por antigüedad: " + (anosAntiguedad * 0.05));
    }

    public void regaloTiempo() {
        System.out.println("Tiempo extra regalado por membresía.");
    }


    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Socio{");
        sb.append("descuento=").append(descuento);
        sb.append(", inicioSocio=").append(inicioSocio);
        sb.append(", tipoDeSocio=").append(tipoDeSocio);
        sb.append(", anosAntiguedad=").append(anosAntiguedad);
        sb.append('}');
        return sb.toString();
    }

    
    

}
