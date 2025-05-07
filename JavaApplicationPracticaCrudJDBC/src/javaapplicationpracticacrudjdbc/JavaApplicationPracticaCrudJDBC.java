/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationpracticacrudjdbc;

import dao.*;
import model.*;
import java.util.*;

/**
 *
 * @author oscarfabrod
 */
public class JavaApplicationPracticaCrudJDBC {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CategoriaDAO catDao = new CategoriaDAO();
    private static final ProductoDAO prodDao = new ProductoDAO();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            System.out.println("1. Agregar Categoría");
            System.out.println("2. Listar Categorías");
            System.out.println("3. Agregar Producto");
            System.out.println("4. Listar Productos");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 ->
                    agregarCategoria();
                case 2 ->
                    listarCategorias();
                case 3 ->
                    agregarProducto();
                case 4 ->
                    listarProductos();
            }
        } while (opcion != 0);
    }

    static void agregarCategoria() throws Exception {
        System.out.print("Nombre: ");
        Categoria c = new Categoria(0, scanner.nextLine());
        catDao.insertar(c);
    }

    static void listarCategorias() throws Exception {
        for (Categoria c : catDao.listar()) {
            System.out.println(c.getId() + " - " + c.getNombre());
        }
    }

    static void agregarProducto() throws Exception {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        listarCategorias();
        System.out.print("ID Categoría: ");
        int idCat = Integer.parseInt(scanner.nextLine());

        Categoria cat = catDao.obtenerPorId(idCat);
        Producto p = new Producto(0, nombre, precio, cat);
        prodDao.insertar(p);
    }

    static void listarProductos() throws Exception {
        for (Producto p : prodDao.listar()) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - "
                    + p.getPrecio() + " - " + p.getCategoria().getNombre());
        }
    }
}
