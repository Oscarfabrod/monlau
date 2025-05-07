/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Producto;
import util.ConnectionPool;
import java.sql.*;
import java.util.*;
import dao.*;
/**
 *
 * @author oscarfabrod
 */
public class ProductoDAO {
    public void insertar(Producto prod) throws SQLException {
        String sql = "INSERT INTO producto(nombre, precio, categoria_id) VALUES(?, ?, ?)";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, prod.getNombre());
            stmt.setDouble(2, prod.getPrecio());
            stmt.setInt(3, prod.getCategoriaId());
            stmt.executeUpdate();
        }
    }
public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCategoriaId(rs.getInt("categoria"));
                productos.add(p);
            }
        }
        return productos;
    }

    public Producto obtenerPorId(int id) throws SQLException {
        String sql = "SELECT * FROM producto WHERE id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("categoria")
                    );
                }
            }
        }
        return null;
    }
}
