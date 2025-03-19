package com.example.ofabregat.demo_of.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
//@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgConstructor
@table(name = "productos")
public class Producto {
    @Id @GeneratedValue
    private Integer id;
    private String nombre;
    private float precio;

    // Getters
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}