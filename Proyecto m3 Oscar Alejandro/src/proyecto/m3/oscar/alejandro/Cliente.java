/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.m3.oscar.alejandro;

/**
 *
 * @author oscarfabrod
 */
public class Cliente {
    private String atraccionMontada;
    private String nombre;
    private int cuantasVeces;
    private String opinion;
    private int valoracion;
    private String apellido;

    public String getAtraccionMontada() {
        return atraccionMontada;
    }

    public void setAtraccionMontada(String atraccionMontada) {
        this.atraccionMontada = atraccionMontada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuantasVeces() {
        return cuantasVeces;
    }

    public void setCuantasVeces(int cuantasVeces) {
        this.cuantasVeces = cuantasVeces;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cliente(String atraccionMontada, String nombre, int cuantasVeces, String opinion, int valoracion, String apellido) {
        this.atraccionMontada = atraccionMontada;
        this.nombre = nombre;
        this.cuantasVeces = cuantasVeces;
        this.opinion = opinion;
        this.valoracion = valoracion;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("atraccionMontada=").append(atraccionMontada);
        sb.append(", nombre=").append(nombre);
        sb.append(", cuantasVeces=").append(cuantasVeces);
        sb.append(", opinion=").append(opinion);
        sb.append(", valoracion=").append(valoracion);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    

     public void rankingAtracciones() {
        System.out.println("Ranking generado para la atracción: " + atraccionMontada);
    }
}